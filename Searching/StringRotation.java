package com.company;
import java.util.Scanner;
class StringRotation
{
    static boolean areRotations(String word1, String word2)
    {
        return (word1.length() == word2.length()) &&
                ((word1 + word1).contains(word2));
    }
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        String word1 = in.next();
        String word2 = in.next();
        if (areRotations(word1, word2))
            System.out.println("1");
        else
            System.out.print("-1");
    }
}
