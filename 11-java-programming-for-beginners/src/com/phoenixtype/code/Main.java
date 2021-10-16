package com.phoenixtype.code;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AddCheck addCheck = new AddCheck(5, 2, 3, 4);
        addCheck.greaterThan();

        Angles angles = new Angles(60, 60, 60);
        angles.triangleFormation();

        EvenNumber evenNumber = new EvenNumber(3);
        evenNumber.isEven();

        Multiply multiply = new Multiply(6);
        multiply.timesTable();

    }
}
