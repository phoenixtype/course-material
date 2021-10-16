package com.phoenixtype.code;

import java.util.Scanner;
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next; //reference
    Node(int d) {
        data = d;
        next = null;
    }
}

class SolutionNode {

    public static  Node insert(Node head,int data) {
        //Complete this method
        Node current = head; //Keep the head refernece of a linked list safe
        Node temp = null;

        if (current == null) { //if the linked list is empty
            //current = new Node(data);
            temp = new Node(data);
            current = temp;
            return temp;
        } else {
            while (current.next != null) {
                current = current.next; //runs until we reach the tail node
            }
            current.next = new Node(data);
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
