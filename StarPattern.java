package Recursion;

public class StarPattern {
    public static void main(String [] args){

        pattern(5,1,1);
    }
    public static void pattern(int n , int rows, int cols){
        if(rows>n){
            return;
        }
        if(cols>rows){
            System.out.println();
            pattern(n,rows+1,1);
            return;
        }

        System.out.print(" * ");
        pattern(n,rows,cols+1);
    }
}
