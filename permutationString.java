package Recursion;

import java.util.ArrayList;

public class permutationString {
    public static void main (String [] args){

        String str = "abc";
        System.out.println(getPermutation(str));
    }

    public static ArrayList<String> getPermutation(String str){

        if(str.length()==0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

       ArrayList<String> rr =  getPermutation(ros);
        ArrayList<String> myResult = new ArrayList<>();

        for(String rrs: rr ){
            for(int i=0; i<=rrs.length();i++){
                String val = rrs.substring(0,i)+ch+rrs.substring(i);
                myResult.add(val);
            }
        }
        return myResult;
    }
}
