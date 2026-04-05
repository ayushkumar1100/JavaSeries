class CheckArmstrongNumber{
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        int num1 = num;
        int num2 = num;
        int digitCount = 0;
        while(num1 != 0){
            digitCount ++;
            num1 /= 10;
        }
        int sum = 0;
        while(num2 != 0){
            sum += Math.pow((num2 % 10), (digitCount));
            num2 /= 10;
        }

        if(sum == num){
            System.out.println("Yes, " + num + " is an Armstrong number.");
        }
        else{
            System.out.println("No " + num + " is not an Armstrong number. Better luck try again!");
        }
    }
}