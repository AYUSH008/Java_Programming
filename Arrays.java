public class Arrays {


    public static void main(String[] args) {

        //declare array
        int arr [] = null;
        System.out.println(arr);

        //allocate the memory in heap once you use "new" keyword
        arr = new int[5];
        System.out.println(arr);

        //get the value
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //set the values
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        //get the values
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //print using for loop
        for(int i=0;i< arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        //Print using enhanced for loop
        for(int val : arr)
        {
            System.out.println(val);
        }
    }
}
