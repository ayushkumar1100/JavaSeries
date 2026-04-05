class PrimeNumberDigitSum{
    public static void main(String[] args){
        int[] arr = new int[Integer.parseInt(args[0])];
        for(int i=0; i<Integer.parseInt(args[0]); i++){
            arr[i] = Integer.parseInt(args[i+1]);
        }
        int count;

        for(int i=0; i<arr.length; i++){
            count = 0;
            for(int j=1; j<=arr[i]; j++){
                if(arr[i] % j == 0){
                    count ++;
                }
            }

            if(count == 2){
                System.out.print(arr[i] + " ");
                int sum = 0;
                while(arr[i] != 0){
                    sum += arr[i] % 10;
                    arr[i] /= 10;
                }
                System.out.println(sum);
            }
        }
    }
}