package com.sda.tallin6.fundamentals.data.classes.statics;

public class Bicycle {

    private int cadence;
    private int gear;
    private int speed;
    public  String name;
    static int count = 0;
    public  int instanceCount;

    public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
        count++;
        instanceCount++;
    }
    public static final double PI = 3.1415292583943094;
    public static final int TEMPERATURE_BOILING_WATER = 100;



}


