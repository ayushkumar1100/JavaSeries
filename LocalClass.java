//Printing the details of n number of  students using Local Class
import java.util.Scanner;
class StudentInfo
{
    StudentInfo()
    {
        class StudentDetails
        {
          StudentDetails(int regnum, double percentage,int totalMarks, double CGPA, String Grade)
          {
             System.out.println("The details of the student having registration number "+regnum+" is as:"); 
             System.out.println("The total marks is: "+totalMarks);
             System.out.println("The percentage is: "+percentage);
             System.out.println("The CGPA is: "+CGPA); 
             System.out.println("The Grade is: "+Grade); 
          }
        } 
        Scanner sc = new Scanner(System.in);
        int numStudents = sc.nextInt();
        int numSubject = sc.nextInt();
        double percentage,CGPA;
        int[] RegNum = new int[numStudents];
        int[] Subjectmarks = new int[numSubject];
        int[][] StudentSerial = new int[numStudents][numSubject];
        int total;
        String Grade;
         StudentDetails[] si = new StudentDetails[numStudents];
        for(int i=0;i<numStudents;i++)
        {
            Grade="";
            total = 0;
            CGPA=0.0;
            percentage=0.0;
            RegNum[i] = sc.nextInt();
            for(int j=0;j<numSubject;j++)
            {
              StudentSerial[i][j]=sc.nextInt();
               total +=  StudentSerial[i][j];
            }
          percentage = total/numSubject;
          CGPA = percentage/10;
          Grade = (percentage>=90 ? "O":percentage>=80 ? "A+":percentage>=70 ? "A":percentage>=60 ? "B":percentage>=50 ? "C":percentage>=40 ? "D":"E"); 
          si[i] = new StudentDetails(RegNum[i],percentage,total,CGPA,Grade);
        }
        
    }
}
class LocalClass
{
    public static void main(String[] args)
    {
        StudentInfo si = new StudentInfo();
        
    }
}