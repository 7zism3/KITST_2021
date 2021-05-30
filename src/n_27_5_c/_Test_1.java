package n_27_5_c;

interface Drawable {
    public void draw();
}

interface Sayable {
    public String say(String name);
}

interface Addable {
    int add(int a, int b);
}


class _test_1 {
    public static void main(String[] args) {

        //Ví dụ 1
        int width = 10;
        // without lambda, Drawable implementation using anonymous class
        Drawable d = new Drawable() {
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();

        //C2
        Drawable d2 = () -> {
            System.out.println("Drawing 2 " + width);
        };
        d2.draw();

        //Ví dụ 2
        Sayable s1 = (hoten) -> { // Lambda expression with single parameter.
            return "Hello, " + hoten;
        };
        System.out.println(s1.say("Sonoo"));
        Sayable s2 = name -> { // You can omit function parentheses
            return "Xin chào, " + name;
        };
        System.out.println(s2.say("Sonoo"));

        //
    }
}

