import java.util.Scanner;

class studentsperformance{
  public static void main(String[] args){
    int numstudents, numsubjects;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of students : ");
    numstudents = sc.nextInt();
    System.out.print("Enter the number of subjects : ");
    numsubjects = sc.nextInt();
    int[][] studentsmarks = new int[numstudents][numsubjects];
    double totalmarks, percentage;
    String grade;
    for(int i=0;i<numstudents;i++){
      percentage =0.0;
      grade ="";
      totalmarks = 0.0;
      System.out.println("Enter the marks of student "+(i+1)+" in "+numsubjects+" subjects");
      for(int j=0;j<numsubjects;j++){
        studentsmarks[i][j]=sc.nextInt();
        totalmarks +=studentsmarks[i][j];
      }
      percentage = totalmarks/numsubjects;
      grade = (percentage>=90 ? "O" : percentage>=80 ? "A+" : percentage>=70 ? "A" : percentage>=60 ? "B" : percentage>=50 ? "C" : percentage>=40 ? "D": "E");
      System.out.println("The total marks of student "+(i+1)+" in "+numsubjects+" subjects is "+totalmarks);
      System.out.printf("The percentage of student "+(i+1)+" is: %.2f",percentage);
      System.out.println("\nThe grade of student "+(i+1)+" is: "+grade);
      System.out.println("\n----------------------------------\n");
    }
  }

}