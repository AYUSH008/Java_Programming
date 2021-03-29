package Recursion;

public class RecursionPrint {
    public  static  void main (String []args){

        PrintReverse(5);
    }

    public static void PrintReverse(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        PrintReverse(n-1);
    }
}
