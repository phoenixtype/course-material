package com.phoenixtype.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class SolutionBubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

        //bufferedReader.readLine() - reads one line as a String. The string isn't assigned to any variable.
        //replaceAll("\\s$", "") is anchored at the end of the line and removes the last whitespace. Using String#trim would have been better.
        //split(" ") splits the string into a String[], breaking it apart at whitespaces
        //Stream.of(String[]) takes the String[] we now have and returns a Stream<String>
        //Stream<String>.map(Function<String, Integer>) converts the Stream<String> into a Stream<Integer> by applying the mapping function (Integer::parseInt) to each element of the stream
        //Stream<Integer>#collect(toList()) takes a String<Integer> and collects it into a List<Integer>
        //List<Integer> a = ...assigns the result of the aforementioned steps to the variable a

        // Write your code here


        for (int i = 0; i < n; i++) {
            a.add(i, bufferedReader.read());
        }

        int[] arr = a.stream().mapToInt(Integer::intValue).toArray();

        int numSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    numSwaps++;
                }
            }

            if (numSwaps == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length - 1]);


        bufferedReader.close();
    }
}

