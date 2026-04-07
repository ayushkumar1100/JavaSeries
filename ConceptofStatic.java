class ConceptofStatic
{
    static int a;
    public static void print()
    {
        a = a+10;
        System.out.print(a + " ");
    }
    int b;
    public void print1()
    {
        b = b+10;
        System.out.print(b + " ");
    }

    public static void main(String[] args)
    { 
        ConceptofStatic obj1 = new ConceptofStatic();
        ConceptofStatic obj2 = new ConceptofStatic();
        ConceptofStatic obj3 = new ConceptofStatic();
        
        for(int i=1;i<=3;i++)
          {
          obj1.print();    // different objects will share the same variable a 
          obj2.print();
          obj3.print();
          }
          System.out.println("\n--------------------------------");
          for(int i=1;i<=3;i++)
          {
          obj1.print1();  // different objects will have their own variable b
          obj2.print1();
          obj3.print1();
          }
    }
    
}



// output: 
// 10 20 30 40 50 60 70 80 90 (value of a is shared among all objects, so it increments by 10 each time print() is called, regardless of which object calls it.)
// --------------------------------
// 10 10 10 20 20 20 30 30 30 (value of b is unique to each object, so it increments by 10 each time print1() is called for that specific object.)