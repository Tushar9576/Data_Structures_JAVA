package Strings;

import java.util.ArrayList;

public class dicerolls {
    public static void main(String[] args) {
        // roll("" , 4);
        System.out.println(rollret("",4));
    }
    static void roll(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <=target  ; i++) {
            roll(p+i, target-i);
        }
    }
    static ArrayList<String> rollret(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <=target  ; i++) {
            ans.addAll(rollret(p+i, target-i));
        }
        return ans;
    }
}
