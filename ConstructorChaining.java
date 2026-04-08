class Demo {
    Demo() {
        this(10);   // calls parameterized constructor
        System.out.println("Default constructor");
    }

    Demo(int x) {
        this(10,20); // calls parameterized constructor with two parameters
        System.out.println("Value: " + x);
    }

    Demo(int x, int y) {
        System.out.println("Values: " + x + ", " + y);
    }
}

class ConstructorChaining {

    public static void main(String[] args) {
        Demo d = new Demo();
    }
}