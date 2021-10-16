package com.phoenixtype.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        for (int i = 1; i < 11; i++) {
            int d = n * i;
            System.out.println(n + " x " + i + " = " + d);
        }
    }
}
