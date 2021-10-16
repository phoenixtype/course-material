package com.phoenixtype.code;

public class Angles {
    int angle1;
    int angle2;
    int angle3;

    public Angles(int angle1, int angle2, int angle3) {
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = angle3;
    }

    public void triangleFormation() {
        if ((angle1 + angle2 + angle3) == 180) {
            System.out.println("Triangle");
        } else {
            System.out.println("Not triangle");
        }
    }
}
