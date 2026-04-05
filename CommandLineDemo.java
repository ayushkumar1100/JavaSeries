class CommandLineDemo{
    public static void main(String[] args){
        int n = args.length;
        int sum = 0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(args[i]);
            sum += arr[i];
        }
        System.out.println("The sum of the number entered by you during Command Line Execution is: " + sum);
        //System.out.println("First argument: " + args[0]);
        //System.out.println("Second argument: " + args[1]);
        //System.out.println("third argument: " + args[2]);
    }
}


/* execution command in terminal :
java CommandLineDemo.java Hello Indian World
as many argument you want to print, you need to write during execution only.

Output: First argument: Hello
        Second argument: Indian
        third argument: World
*/