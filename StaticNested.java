// Static nested class in java
class OuterClass
{
    static int x;
    static class innerClass
    {
        void getData()
        { 
          System.out.println("Static Nested class: "+ ++x);  
        }
    }
}
class StaticNested
{
    public static void main(String[] args)
    {
         OuterClass.innerClass obj = new OuterClass.innerClass();  // point to note here is that we can create object of static nested class without creating object of outer class because static nested class is static in nature and it can be accessed without creating object of outer class. we can directly access static members of outer class using static nested class.
          obj.getData();
       
    }
}