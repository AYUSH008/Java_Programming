package AdvanceJavaLinkedIn;


import java.util.ArrayList;
import java.util.List;

public class genericExample {

    static Character[] charArray = {'h','e','i','k','l'};
    static Integer [] intArray = {1,2,3,4,5};
    static Boolean [] boolArray = {true, false, true};

    public static List arrayToList(Object [] array,List <Object> list){
        for (Object object: array){
            list.add(object);
        }
        return list;
    }

   public static void main (String []args){
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
       System.out.println(intList.get(0));
       System.out.println(boolList.get(0));
       System.out.println(charList.get(0));


       //without generic
       List names1  = new ArrayList();
       names1.add("Jack");
       String name  = (String ) names1.get(0);
       System.out.println("First Name"+ names1);

       //with Generic
       List<String> names2  = new ArrayList();
       names2.add("Kelly");
       String nameNew  = names2.get(0);
       System.out.println("First Name "+ names2);
       //names2.add(7);

   }


}
