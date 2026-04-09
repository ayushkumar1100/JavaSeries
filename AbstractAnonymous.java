// Anonymous Class to implement the abstract method of abstract class and overriding non-abstract 
//method of abstract class.
import java.util.Scanner;
abstract class ABC
{
 abstract void getData();
 void printPrime()
 {
 System.out.println("This is the non-abstract method"); 
 }
}
 class AbstractAnonymous
 {
     
     void ConceptofAnonymous1()
     {
      ABC obj = new ABC()
     {
     public void printPrime()
     {
      
       System.out.println("Overriding of method by anonymous class"); 
     }
     public void getData()
     {
     System.out.println("abstract method of abstract class"); 
     }
 };
 obj.printPrime();
 obj.getData();
 }
 public static void main(String args[])
     {
     AbstractAnonymous obj1 = new AbstractAnonymous();
     obj1.ConceptofAnonymous1();
     }
 }