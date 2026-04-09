//Non-Static Nested Class in java
class OuterClass
{
    static int x;
    class innerClass
    {
        void getData()
        { 
          System.out.println("Non-Static Nested class: "+ ++x);  
        }
    }
}
class NonStaticNested
{
    public static void main(String[] args)
    {
        OuterClass obj = new OuterClass();
         OuterClass.innerClass obj1 = obj.new innerClass();
          obj1.getData();
       
    }
}