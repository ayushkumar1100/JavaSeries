import java.util.Scanner;
class Employee{
    int salary, ID, age, time ;
    double IncrementedSalary, AppraisalPer;
}
class Developer extends Employee{
  int Bonus;
  void Developerdetails(){
      System.out.println("The Employee ID is: "+ID);
      System.out.println("The salary is: "+(salary+Bonus));
      System.out.println("The age is: "+age);
      System.out.println("The Incremented salary after "+time+" year is: "+IncrementedSalary);
      System.out.println("The Gross salary after "+time+" year is: "+(IncrementedSalary+salary));
      System.out.println("His task is to Write the code");
  }
}
class ConceptofSingleInheritance
{
    public static void main(String[] args)
    {
        Developer obj = new Developer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee ID, salary, Bonus, age, time and Appraisal percentage of the employee in the following order: ");
        obj.ID = sc.nextInt();
        obj.salary = sc.nextInt();
        obj.Bonus = sc.nextInt();
        obj.age = sc.nextInt();
        obj.time = sc.nextInt();
        obj.AppraisalPer = sc.nextDouble();
        obj.IncrementedSalary = (obj.salary*obj.AppraisalPer*obj.time)/100;
        obj.Developerdetails();
    }
}