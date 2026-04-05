class SquarePatternSum{
  public static void main(String[] args){
    int num = Integer.parseInt(args[0]);
    int sum = 0;
    for(int i=1; i<=num; i++){
      sum += Math.pow(i,2);
      if(i != num){
        System.out.print(i + " ^ 2 + ");
      }
      else{
        System.out.print(i + " ^ 2 = ");
      }
    }
    System.out.println(sum);
  }
}