package com.phoenixtype.code;

public class AddCheck {
    int a; int b; int c; int d;

    public AddCheck(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void greaterThan() {
        if ((a + b) > (c+d)) {
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        };
    }
}
