//  Java Supports Multiple Inheritance Using Interfaces.
interface A {
    void show();
}
interface B {
    void show();
}
class C implements A, B {
    public void show() {
        System.out.println("Implemented in C");
    }
}

class DiamondProblemSolution {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}


/*Why C++ Supports It But Java Doesn’t?
C++ allows multiple inheritance but solves ambiguity using scope resolution operator ::
obj.B::show();
obj.C::show();
*/