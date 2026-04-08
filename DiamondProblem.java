/*Why Multiple Inheritance is NOT Supported in Java (for Classes)?
Java does NOT support:
class C extends A, B     // Not allowed
Because it creates a problem called the “Diamond Problem”
What is the Diamond Problem?.
Consider this structure:
                            A

                        B        C
 
                                                
                            D
Class B extends A
Class C extends A
Class D extends both B and C

Program:
class A {
    void show() {
        System.out.println("Class A");
    }
}
class B extends A {
    void show() {
        System.out.println("Class B");
    }
    void show() {
        System.out.println("Class A");
    }

}
class C extends A {
    void show() {
        System.out.println("Class C");
    }
    void show() {
        System.out.println("Class A");
    }

}
class D extends B, C {     // Suppose this was allowed
}
              class DiamondProblem
{
 public static void main(String[] args)
{
D obj = new D();
obj.show();
}
}

Which show() should run?
Class B?
Class C?
Java cannot decide automatically
This is the Diamond Ambiguity Problem.

*/
