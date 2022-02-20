package com.company;

public class Main {

    public static void main(String[] args) {

        Time time = new Time (1, 1, 0);

        time.addMinute(120);

        System.out.println(time.toString());
    }
}

