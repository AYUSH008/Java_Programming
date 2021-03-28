package TwoDimensionalArray;

import java.util.Scanner;

public class TwoDArrayOps {
    public static void main(String[] args) {

       /* int[][] arr = takeInput();
        display(arr);*/
//        display(arr);
//        arr[0][0]=10;
//        arr[2][0]=20;
//        System.out.println("***************");
//        display(arr);
        int [][] arr = {{10,20,30},{34,23,56},{64,23,45}};
        display(arr);

    }
    public static int [][] takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = s.nextInt();
        System.out.println("Enter number of columns");
        int cols = s.nextInt();
        int [][] arr = new int[rows][cols];
        for(int row=0;row<rows;row++) {
            for (int col =0; col< cols;col++){
                arr[row][col] = s.nextInt();
            }

        }
        return arr;
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
            }
        }
    }


