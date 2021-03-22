import java.util.Scanner;

public class ArrayOperations {
    static Scanner scan = new Scanner(System.in);

    public static void main (String []args){

        /*int [] arr = takeInput();
        display(arr);*/
        int [] arr = {10,20,30,35};
        System.out.println(maxArray(arr));
    }

    public static int [] takeInput(){
        System.out.printf("What will be the size of array?");
        int n = scan.nextInt();

        int [] arr = new int[n];
        for (int i =0; i<arr.length;i++){
            System.out.println("What value for index"+" "+ i + " size ?");
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void display(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println("Array value on index"+ i +
                    " is "+ arr[i]);
        }
    }

    public static int maxArray(int [] arr){
        int max = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> max)
            {
                max = arr[i];
            }
        }
        return max;
        }
}
