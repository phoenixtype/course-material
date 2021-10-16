package com.phoenixtype.code;

import java.io.*;
import java.util.*;

public class SolutionCharArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        scan.nextLine();

        for (int i = 0; i < N; i++) {
            String string = scan.nextLine();
            char[] charArray = string.toCharArray();

            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(charArray[j]);
                }
            }

            System.out.print(" ");

            for (int j = 0; j < charArray.length ; j++) {
                if (j % 2 != 0) {
                    System.out.print(charArray[j]);
                }
            }
            System.out.println();

        }
        scan.close();
    }
}
