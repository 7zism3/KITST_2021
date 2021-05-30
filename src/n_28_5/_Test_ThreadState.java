package n_28_5;

public class _Test_ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread((new Runnable() {
            @Override
            public void run() {
                Thread self = Thread.currentThread();
                System.out.println(self.getName() + " is "
                + self.getState()); //Dòng 1
            }
        }));
        System.out.println(t.getName() + " is "
                + t.getState()); //Dòng 2
        t.start();
        t.join();
        if (t.getState() == Thread.State.TERMINATED){
            System.out.println(t.getName() + " is "
                    + t.getState()); //Dòng 3
        }
    }
}
