// Concept of Upcasting and Downcasting
// int a = 10;
// double b = a;// Implicit type casting.

// double b = 10.3;
// int a = b;   // error. Explicit type conversion is required.
// solution : int a = (int)b; // Explicit type casting.

// parentclass obj1 = new parentclass();  //normal way of creating an object of parent class
// childclass obj2 = new childclass();  // normal way of creating an object of child class

// parentclass obj3 = new childclass();   //is equivalent to double b = a;
// we are creating the refernce variable of parentclass and object of child 
// this concept is called as upcasting.
// childclass obj4 = (childclass)obj3;   // downcasting




class Vehicle{
    void move()
    {
        System.out.println("Vehicle moves");
    }
    void Break()
    {
        System.out.println("Vehicle stops");
    }
}
class Car extends Vehicle{
    void move()
    {
        System.out.println("car moves");
    }
    void Break()
    {
        System.out.println("car stops");
    }
    void Accelerates()
    {
        System.out.println("car Accelerates");
    }
}
class UpcastingandDowncasting{
    public static void main(String[] args){
        Vehicle obj = new Car();
        obj.move(); // it is printing the method of child class because of method overriding and runtime polymorphism because of upcasting.
        obj.Break();
        //obj.Accelerates(); // error because reference variable of parent class cannot access the method of child class.
        Car obj1 = (Car)obj;
        obj1.Accelerates();
        obj1.move();
        obj1.Break();
    }
      
}



/* 
Java uses:
        Reference type → at compile time
        Object type → at runtime

Step 1: Compile-time check

        Compiler checks:

        "Does Vehicle have move()?"

        Yes → So code is allowed    

Step 2: Runtime behavior (REAL MAGIC)

        At runtime, JVM checks:

        "Which object's method should I run?"

        Object is actually Car
        Car overrides move()

        ✔ So JVM calls:  Car's move()  

This is called Dynamic Method Dispatch (DMD) or Runtime Polymorphism.

*/