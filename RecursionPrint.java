package Recursion;

public class RecursionPrint {
    public  static  void main (String []args){

        //PrintReverse(5) ;
      //  PrintReverseDe(5);
        //PDI(5);
        PDISkip(5);
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
    public static void PDI(int n){
        if(n==0){
            return;
        }
        System.out.println(n+" ");
        PDI(n-1);
        System.out.println(n);
    }
    public static void PDISkip( int n)
    {
        if(n==0){
            return ;
        }
        if(n%2==1){
            System.out.println(n);
        }
        PDISkip(n-1);
        if(n%2==0){
            System.out.println(n);
        }

    }

}
