package Recursion;

public class Factorial {
    public static void main (String []args){
        //int fact = factorial(4);
      int fact = fibonacci(5);
        System.out.println(fact);
    }
    public static int factorial(int n){

        if(n==1){
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
}
