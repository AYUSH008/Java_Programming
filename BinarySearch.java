public class BinarySearch {
    public static void main(String []args)
    {
        int [] arr = {5,7,10,12,14,20,27,31,36,42,55,60,65,70};
        System.out.println(search(arr,36));
    }
    public static int search(int []arr, int item){
        int low =0,high = arr.length-1;
        int ans=-1;
        while(low<=high)
        {

            int mid = (low +high)/2;
            if(arr[mid]<item){

                low=mid+1;
            }else if(arr[mid]>item){
                high=mid-1;
            }else
            {
                return mid;
            }

        }
        return -1;
    }
}
