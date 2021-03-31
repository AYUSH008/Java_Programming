package Recursion;

public class IsArraySorted {
    public static void main(String[]args){

        int [] arr = {2,3,4,6,3};
        System.out.println(isSorted(arr,0));

    }
    public static boolean isSorted(int [] arr , int si){

        if(si == arr.length-1){
            return true;
        }
        if(arr[si]>arr[si+1]){
            return false;
        }else{
            boolean resetAns = isSorted(arr, si+1);
            return resetAns;
        }
    }
}
