// Anonymous Class in Java without separate class for main method
interface MyInterface {
    void show();
}
class AnonymousWithoutMain {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface() {
            public void show() {
                System.out.println("Hello World");
            }
        };
        obj.show();
    }
}