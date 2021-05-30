package n_28_5;

public class _Test_ThreadEx1 extends Thread {
    public void run (){
        System.out.println("My name is: "+ getName());
    }

    public static void main(String[] args) {
        _Test_ThreadEx1 t1 = new _Test_ThreadEx1();
        t1.start();
        System.out.println("My name is:   "
                + Thread.currentThread().getName());
    }
}
