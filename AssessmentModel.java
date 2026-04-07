import java.util.Scanner;
class CalulateAssesmentModel{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double ProgPrac,WrittenMarks,FirstOnline,SecondOnline,Attendance,eligibilityPP,ActualOnline,ActualProgprac,Attmarks,total,ETPViva,ETPEx,ETPWritten, CalVivaWrittenper, ActualEx,totalETP;
        System.out.println("Enter Programming Practice Attemption out of 120");
        ProgPrac = sc.nextDouble();
        System.out.println("Enter Written marks out of 30");
        WrittenMarks = sc.nextDouble();
        System.out.println("Enter First online test marks out of 30");
        FirstOnline = sc.nextDouble();
        System.out.println("Enter Second online test marks out of 30");
        SecondOnline = sc.nextDouble();
        ActualOnline = (FirstOnline>=SecondOnline)?FirstOnline:SecondOnline;
        eligibilityPP = (ProgPrac<60)?0:(((ProgPrac/120)*100)*15)/100;
        ActualProgprac = ((((WrittenMarks+ActualOnline)/60)*100)*eligibilityPP)/100;
        System.out.println("Enter the attendance:");
        Attendance  = sc.nextDouble();
        Attmarks = (Attendance>=90 ? 5 : Attendance>=85 ? 4 : Attendance>=80 ? 3 : Attendance>=75 ? 2 : 0); 
        total = Attmarks + ActualProgprac + (WrittenMarks/30)*20 + (ActualOnline/30)*15 ;

        System.out.println("Enter ETP Viva marks out of 40");
        ETPViva = sc.nextDouble();
        System.out.println("Enter ETP Written marks out of 30");
        ETPWritten = sc.nextDouble();
        System.out.println("Enter ETP Execution marks out of 30");
        ETPEx = sc.nextDouble();
        CalVivaWrittenper = ((ETPViva + ETPWritten)/70)*100;
        ActualEx = CalVivaWrittenper<60 ? ((ETPEx)/100*CalVivaWrittenper): ETPEx;
        totalETP = (ETPViva+ETPWritten+ActualEx)/100*45;

        total += totalETP;

        System.out.println("The total marks out of 100 is: "+total);
        }
}