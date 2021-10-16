package com.phoenixtype.code;

//write a function that takes a string and reverses it
//Code Complete 2nd edition - check it out (Safari books)
//Take exercise
//OOP concepts
//6 months for Desjardins
//Return a list of employees/objects - what is the best way. you don't return list you create an object and return it.
//Don't just return kist return instead an object that contains employees.
//Talk to your interviewer
//Ambiguous ask questions
import java.util.*;

class Reverse {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Original String: " + input);

//        char[] inputStringArray = input.toCharArray();
//        String reverseString = "";
//        for (int i = inputStringArray.length - 1; i >= 0; i--) {
//            reverseString += inputStringArray[i];
//        }
//        System.out.println(reverseString);

        // Reverse rev = new Reverse();
        Reverse.reverseString(input);


    }


    public static String reverseString(String inputString) {
        char[] inputStringArray = inputString.toCharArray();
        String reverseString = "";
        for (int i = inputStringArray.length - 1; i >= 0; i--) {
            reverseString += inputStringArray[i];
        }
        System.out.println(reverseString);
        return reverseString;
    }


//    public static void reverseString(String inputString) {
//        char[] inputStringArray = inputString.toCharArray();
//        for (int i = inputStringArray.length - 1; i >= 0; i--) {
//            System.out.print(inputStringArray[i]);
//        }
//    }

}

