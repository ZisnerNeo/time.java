package com.company;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void addHour(int delta) {
        hour += delta;
    }

    public void addMinute(int delta) {
        minute += delta;
        if (minute > 59) {
            addHour(1);
            minute = minute - 60;
            if (minute > 59) {
                addMinute(0);
            }
        }
    }

    public void addSecond(int delta) {
        second += delta;
        if (second > 59) {
            addMinute(1);
            second = second - 60;
            if (second > 59) {
                addSecond(second);
            }
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
