package com.phoenixtype.code;

public class Multiply {
    int table = 6;

    public Multiply(int table) {
        this.table = table;
    }

    public void timesTable() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%table x %table = table", table, i, table*i).println();
        }
    }
}
