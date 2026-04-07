class SumNum{
   void print(double...arr){    // varargs method to accept variable number of arguments and internally it will be treated as an array
        
        double sum=0;         
        for(double i:arr) sum+=i;
    


        System.out.println((char)arr[arr.length-1]);  // printing the last element of the array which is a character in this case
        System.out.println("The sum is "+sum);
    }
}
class ConceptofVarargs{
    public static void main(String[] args)
    {
       SumNum obj = new SumNum();
       obj.print('a');
       obj.print(1,'a');
       obj.print('a',1,2.2,'a');
       obj.print('a',1,2,3.4,'a');
       obj.print('a',1,2,3.5,4,5.5,'a');
       
    }
}