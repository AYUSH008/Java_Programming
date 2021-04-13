package Recursion;

import java.util.ArrayList;

public class MazePath {
    public static void main (String [] args){
        System.out.println(getMazePath(0,0,2,2));

    }
    public static ArrayList<String> getMazePath(int cr,int cc, int er,int ec){

        if(cr == er & cc == ec){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        if(cr > er || cc > ec){
            ArrayList<String> baseResult = new ArrayList<>();
            return baseResult;
        }
        ArrayList<String> myResult = new ArrayList<>();
        ArrayList<String> rrh = getMazePath(cr, cc+1, er, ec);
        for(String rrhs:rrh){
            myResult.add("H"+rrhs);
        }
        ArrayList<String> rrc = getMazePath(cr+1, cc, er, ec);
        for(String rrcs:rrc){
            myResult.add("V"+rrcs);
        }
        return myResult;
    }
}
