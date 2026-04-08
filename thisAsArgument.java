
class A {
    void show(A obj) {
        System.out.println("Method called");
    }

    void call() {
        show(this);  // equivalent to show(a); where a is the current object of class A.
    }
}

class thisAsArgument {
    public static void main(String[] args) {
        A a = new A();
        a.call();
    }
}
