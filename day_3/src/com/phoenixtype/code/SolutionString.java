package com.phoenixtype.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        bufferedReader.close();
        try {
            Integer integer = Integer.parseInt(S);
            System.out.println(integer);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Bad String");
        }
    }
}
