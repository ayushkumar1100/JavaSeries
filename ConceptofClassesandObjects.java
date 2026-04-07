import java.util.Scanner;
class Student
{
 String name, regNum, address, course, Mobile;
 void getStudentDetails()
 {
   System.out.println("The name of the student is: "+name);
   System.out.println("The Registration Number of the student is: "+regNum);
   System.out.println("The address of the student is: "+address); 
   System.out.println("The course of the student is: "+course);
   System.out.println("The Mobile number of the student is: "+Mobile);
 }
}
class ConceptofClassesandObjects
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int n;
       System.out.print("Enter the total number of students: ");
       n = sc.nextInt();
       sc.nextLine();  //  whenever you take String input after an integer input, it is necessary to consume the newline character comes after reading the integer input.
       Student[] st = new Student[n]; 
       for(int i=0;i<n;i++){
        System.out.println("Enter the details of student "+(i+1)+" in the following order: name, regNum, address, course, Mobile");
        st[i] = new Student(); // this is necessary to create an object of the Student class for each element of the array, otherwise we will get a NullPointerException when we try to access the properties of the Student class through the array elements.
        st[i].name = sc.nextLine();
        st[i].regNum = sc.nextLine();
        st[i].address = sc.nextLine();
        st[i].course = sc.nextLine();
        st[i].Mobile = sc.nextLine();
        st[i].getStudentDetails();
        System.out.println("--------------------------");
      }
    }
}