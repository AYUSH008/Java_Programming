public class testClass {

    public static void main(String [] args){
        int [] arr = null;
        System.out.println("Array value is : "+ arr);

        arr = new int [5];

        System.out.println("Heap allocation with base address : "+ arr);
        System.out.println("Array length after allocation : "+ arr.length);

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

       /* for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }*/

        /*for(int data: arr){
            System.out.println(data);
        }*/
     /*reverse order print*/
        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

}
