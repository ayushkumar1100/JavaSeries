/*
super Keyword in Java
 
In Java, super is used to refer to the immediate parent class object.
It is mainly used for:
1.	 Accessing parent class variable
2.	 Calling parent class method
3.	 Calling parent class constructor

 Using super to Access Parent Class Variable
When parent and child have same variable name (variable hiding).
Example
class Parent {
    int x = 10;
}
class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println("Child x: " + x);
        System.out.println("Parent x: " + super.x);
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
 Output
Child x: 20
Parent x: 10
Explanation
•	x → refers to child variable
•	super.x → refers to parent variable







Using super to Call Parent Class Method
When method is overridden.
Example
class Parent {
    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child method");
    }

    void show() {
        display();        // Calls child version
        super.display();  // Calls parent version
    }
}
public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
 Output
Child method
Parent method
Explanation
•	display() → current class version
•	super.display() → parent class version

Using super to Call Parent Constructor
Very important concept 
Example
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super();  // Calls Parent constructor
        System.out.println("Child constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
Output
Parent constructor
Child constructor