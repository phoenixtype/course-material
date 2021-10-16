package com.phoenixtype.code;

import java.util.Scanner;

public class IsPalindrome {

    public boolean calculatePalindrome (String s) {
//        String s = "racecar";
        int firstChar = 0;
        int lastChar = s.length() - 1;

        while (lastChar >= firstChar) {
            if (s.charAt(firstChar) != s.charAt(lastChar)) {
                System.out.println("false");
                return false;

            }
            firstChar ++;
            lastChar --;
        }
        System.out.println("true");
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        IsPalindrome palindromeCalc = new IsPalindrome();
        palindromeCalc.calculatePalindrome(s);



    }
}
