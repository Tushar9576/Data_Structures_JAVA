package com.company;

public class searchinstrings {
    public static void main(String[] args) {
        String str = "Tushar";
        char target = 'T';
        System.out.println(search(str, target));
    }
    static boolean search (String str, char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== target){
                return true;
            }

        }
        return false;
    }
}

