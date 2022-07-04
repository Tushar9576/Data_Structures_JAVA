package Strings;

import java.util.ArrayList;

public class phonepad {
    public static void main(String[] args) {
        pad("","12");
        System.out.println(padcount("","12"));
        ArrayList<String> lsit = padret("","12");
        System.out.println(lsit);

    }
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a' +i);
            pad(p+ch, up.substring(1));

        }
    }
// Below function returns the ans in a list
    static ArrayList<String> padret(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a' +i);
            ans.addAll(padret(p+ch, up.substring(1)));
        }
        return ans;
    }
    // below function returns the count of permutations
    static int padcount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a' +i);
           count = count + padcount(p+ch, up.substring(1));
        }
        return count;
    }
}
