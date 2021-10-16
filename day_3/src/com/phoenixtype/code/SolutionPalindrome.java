package com.phoenixtype.code;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class SolutionPalindrome {
    // Write your code here.
    private LinkedList stack;
    private LinkedList queue;

    public SolutionPalindrome() {
        this.stack = new LinkedList();
        this.queue = new LinkedList();
    }
    //Method that pops and returns the character at the top of the stack instance variable.
    private char popCharacter() {
        return (char) this.stack.pop();
    }
    //Method that pushes a character onto a stack.
    private void pushCharacter(char ch) {
        this.stack.push(ch);
    }
    //Method that dequeues and returns the first character in the queue instance variable.
    private char dequeueCharacter() {
        return (char) this.queue.remove(0);
    }
    //Method that enqueues a character in the queue instance variable.
    private void enqueueCharacter(char c) {
        this.queue.addLast(c);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        SolutionPalindrome p = new SolutionPalindrome();

        // Enqueue/Push all chars to their respective data structures:
        for (char ch : s) {
            p.pushCharacter(ch);
            p.enqueueCharacter(ch);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindromeElement = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindromeElement = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindromeElement) ? "not a palindrome." : "a palindrome." ) );
    }
}
