public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 6, 1, 9};
        System.out.println(linearSearch(arr, 20));
    }

    public static int linearSearch(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                System.out.println("Element Found");
                return i;
            }
        }
        return -1;
    }
}
