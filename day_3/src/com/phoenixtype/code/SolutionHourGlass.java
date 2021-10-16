package com.phoenixtype.code;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SolutionHourGlass {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int arrValue = 6;
        int[][] arr = new int[arrValue][arrValue];

        for (int i = 0; i < arrValue; i++) {
            for (int j = 0; j < arrValue; j++) {
                arr[i][j] = scan.nextInt();
            }

        }

        int max = -9 * 7;

        for (int i = 0; i < arrValue; i++) {
            for (int j = 0; j < arrValue; j++) {
                if (j + 2 < arrValue && i + 2 < arrValue) {
                    int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j +1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                    if (sum > max) {
                        max = sum;
                    }
                }

            }

        }
        System.out.println(max);

    }
}

