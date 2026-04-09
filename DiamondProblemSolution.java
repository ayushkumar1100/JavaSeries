/*  Java Supports Multiple Inheritance Using Interfaces.
 Interface in Java
1. The Interface can contain abstract methods only(no Constructors and non-abstract function is allowed in interface).
2. It can not be instantiated directly.
3. The abstract method of Interface can be defined inside the child/sub-class.
4. To make the Interface we need to use the interface keyword.
5. By default the methods inside the interface are abstract methods without
   writing the abstract keyword.
6. Use implements instead of extends
*/
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