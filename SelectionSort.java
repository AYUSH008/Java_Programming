package OneDimensionalArray;


public class SelectionSort {
    public static void main (String[]args){
        int [] arr = {99,88,77,66,55};
        selectionSort(arr);
        display(arr);

    }
    public static void selectionSort(int [] arr){
        for(int counter= 0;counter< arr.length-1;counter++){
            int min= counter;
            for(int i=counter+1;i< arr.length-1;i++){
                if(arr[i]>arr[min]){
                    min =i;

                }
                int temp = arr[min];
                arr[min] = arr[counter];
                arr[counter]=temp;
            }
        }
    }
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
