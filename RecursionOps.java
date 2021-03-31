package Recursion;

public class RecursionOps {
    public static void main (String []args){
        //int fact = factorial(4);
      //int fact = fibonacci(5);
       // System.out.println(fact);
        int pow = power(2,5);
        System.out.println(pow);
    }
    public static int factorial(int n){

        if(n==0){
            return 1;
        }
        int fact1 = factorial(n-1);
        int factN = n * fact1;
        return factN;
    }

   public static int fibonacci(int n){

        if(n==1 || n==0){
            return n;
        }
        int fib1 = fibonacci(n-1);
        int fibN = fibonacci(n-2);
        int fibR = fib1 + fibN;
        return fibR;
   }
   public static int power(int x, int n){
        if(n==0){
            return 1;
        }

        int pnm1 = power(x,n-1);
        int pnm = x * pnm1;
        return pnm;
   }
}
