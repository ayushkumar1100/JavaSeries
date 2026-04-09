interface ParentClass{}
class ChildClass1 implements ParentClass{}
class ChildClass2 implements ParentClass{}

class InstanceOf
{
    public static void main(String[] args)
    {
          ParentClass obj = new ChildClass1();
          ChildClass1 obj1 = new ChildClass1();
          ChildClass2 obj2 = new ChildClass2();
          obj = obj1;
          System.out.println(obj instanceof ChildClass1);//t
          System.out.println(obj instanceof ChildClass2);//f
          obj = obj2;
          System.out.println(obj instanceof ChildClass1);//f
          System.out.println(obj instanceof ChildClass2);//t
      
    }
}