package TwoDimensionalArray;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOps {
    public static void main (String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of array in list");
        int n= s.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
            arrayList.add(i);

        }
        System.out.println(arrayList);

        //remove 3rd element
        arrayList.remove(2);
        System.out.println("After removing the element ");
        System.out.println(arrayList);

        //Add element at specific position
        arrayList.add(3,45);
        System.out.print(arrayList);
    }
}
