package com.sda.tallin6.fundamentals.data.operators;

public class AssignmentOperators {

    public static void main(String[] args) {
        int speed = 0;
        System.out.println("speed:" + speed);
        boolean b = true;
        char c = 'a';
        int another = speed;
        System.out.println("another:" + another);

        speed += 5;
        System.out.println("Speed value now: " + speed);
        speed -= 50;
        System.out.println("Speed value now: " + speed);

        speed*=5;
        System.out.println("Speed value now: " + speed);

        speed /=10;
        System.out.println("Speed value now: " + speed);

        speed%=5;
        System.out.println("Remainer when we divide speed to 5:" + speed);
        System.out.println("Speed value now:" + speed);
        speed%=5;
        System.out.println("Remainder when we divide speed to 2: " + speed);



    }
}
