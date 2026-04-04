class PalindromeNumberCheck{
    public static void main(String[] args){
        int num = 121, temp = num, rev = 0;
        while(num != 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if(temp == rev){
            System.out.println("Yes, " + temp + " is a palindrome Number");
        }
        else{
            System.out.println("No, " + temp + " is not a palindrome number");
        }
    }
}