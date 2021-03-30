package Recursion;

public class RecursionPrint {
    public  static  void main (String []args){

      //  PrintReverse(5);
        PrintReverseDe(5);
    }

    public static void PrintReverse(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        PrintReverse(n-1);
    }

    public static void PrintReverseDe(int n){
        if(n==0){
            return;
        }
        PrintReverseDe(n-1);
        System.out.print(n+" ");
    }

}
