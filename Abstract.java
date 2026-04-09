/* Abstract Class in Java
1. The Abstract class can contain abstract, non-abstract and Contructors.
2. It can not be intstantiated directly.
3. The abstract method of abstract class can be defined inside
   the child/sub-class.
4. To make the class or method as abstract. we need to write the
   abstract keyword
*/
abstract class ParentClass
{
    int a=5;
    // ParentClass()
    // {
    //   System.out.println("Default Constructor of Abstract class");
    // }
    // ParentClass(int a)
    // {
    //     System.out.println("Parameterized Constructor of Abstract class: "+a);
    // }
    void print()
    {
       System.out.println("print method of Abstract class"); 
    }
   abstract void display();
}
class ChildClass extends ParentClass
{
    int a=10;
    // ChildClass(int y)
    // {
    // super(10);
    // System.out.println("Constructor of Child Class "+super.a+" "+y);
    // }
     void print()
     {
       System.out.println("getData of Child Class "+a);  
     }
    void display()  // it should be defined because it is abstract in parent class. if we are not defining it then we have to make the child class as abstract
    {
       System.out.println("display method of Child Class");  
    }
    void details()
    {
        System.out.println("details method of Child Class");  
    }
}
class Abstract
{
    public static void main(String[] args)
    {
        ParentClass obj = new ChildClass();
      
        obj.display();
        obj.print();
        ChildClass obj1 = (ChildClass)obj;
        obj1.details();
    }
}