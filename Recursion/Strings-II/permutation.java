package Strings;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        ArrayList<String> ans = permutationslist("","abc");
        System.out.println(ans);
        System.out.println(permutationscount("","abc"));
    }
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            permutations(first+ch+second, up.substring(1));
        }
    }
    static ArrayList<String> permutationslist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            ans.addAll(permutationslist(first+ch+second, up.substring(1)));
        }
        return ans;
    }
    static int permutationscount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            count  = count + permutationscount(first+ch+second, up.substring(1));
        }
        return count;
    }
}
