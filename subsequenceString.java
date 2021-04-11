package Recursion;

import java.util.ArrayList;

public class subsequenceString {
    public static void main (String [] args){
        String str = "abc";
        System.out.println(getSS(str));
    }
    public static ArrayList<String> getSS(String str){

        if(str.length()==0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char currentChar = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> myResult = new ArrayList<>();
        ArrayList<String> recResult = getSS(ros);
        for(int i=0;i<recResult.size();i++){
            myResult.add(recResult.get(i));
            myResult.add(currentChar + recResult.get(i));
        }
        return myResult;
    }
}
