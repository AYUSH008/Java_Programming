package Recursion;

import java.util.ArrayList;

public class BoardPath {
    public static void main(String[] args) {

        System.out.println(getBoardPath(0, 10));
    }

    public static ArrayList<String> getBoardPath(int curr, int end) {

        if (curr == end) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("\n");
            return baseResult;
        }

        if (curr > end) {
            ArrayList<String> baseResult = new ArrayList<>();
            return baseResult;
        }

            ArrayList<String> myResult = new ArrayList<>();

            for (int dice = 1; dice <= 6; dice++) {

                ArrayList<String> rr = getBoardPath(curr + dice, end);

                for (String rrs : rr) {
                    myResult.add(dice + rrs);
                }
            }
            return myResult;
        }
    }


