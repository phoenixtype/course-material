package com.phoenixtype.code;

public class EvenNumber {
    int number;

    public EvenNumber(int number) {
        this.number = number;
    }


    public void isEven() {
        if (number%2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Not even");
        }
    }
}
