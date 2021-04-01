package Recursion;

public class FirstIndexSearch {
    public static void main(String []args){
        int [] arr = {6,8,9,2,3,4,2,1,1};
        System.out.println(firstIndex(arr,1,1));

    }
    public static int firstIndex(int [] arr, int si,int data){

        if(si== arr.length){
            return -1;
        }
        if(arr[si]==data){
            return si;
        }
        else{
            int resultAns = firstIndex(arr, si+1,data);
            return resultAns;
        }
    }
}
