class ReverseNumber{
    public static void main(String[] args){
        int num = 123, rev = 0;
        int num_store = num;
        while(num != 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println("The reverse of " + num_store + " is " + rev);
    }
}