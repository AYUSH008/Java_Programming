package Recursion;

public class LastIndexSearch {
    public static void main (String[]args){
        int [] arr = {3,5,6,4,5,4,8};
        System.out.println(lastIndexSearch(arr,0,4));

    }
    public static int lastIndexSearch(int []arr,int si, int data){

        if(si==arr.length){
            return -1;
        }

        int index = lastIndexSearch(arr,si+1,data);

            if(index == -1){
                if(arr[si]==data){
                    return si;
                }else {
                    return -1;
                }
            }else{
                return index;
            }

    }
}
