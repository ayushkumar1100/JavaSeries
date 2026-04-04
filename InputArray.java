import java.util.Scanner;

class InputArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many prime numbers you want to print: ");
        int n = sc.nextInt();
        if(n <= 0) System.out.println("Please enter the value greater than 0.");
        else{
            int[] prime_number = new int[n];
        
            System.out.print("Now, Enter " + n + " primes: ");
            
            for(int i=0; i<n; i++){
                prime_number[i] = sc.nextInt();
            }
            System.out.print("The prime numbers that you entered recently are:  ");
            for(int i=0; i<n; i++){
                System.out.print(prime_number[i] + " ");
            }
            System.out.println("\nThank you, print again.");

        }
        
    }
}