package OneDimensionalArray;

public class InsertionSort {

    public static void main (String[]args){
        int [] arr = {99,88,77,66,55};
        insertionSort(arr);
        display(arr);

    }
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void insertionSort(int [] arr){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
    }
}
}
