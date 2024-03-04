package com.mycompany.app;

public class Time {
    public int hour;
    public int minute;
    public int second;

public void setHour(int h) {
    if (h >= 0 && h < 24){
        hour = h;
    } else {
        System.out.println("Invalid number. Please check");
    }
}

public void setMinute(int m){
    if (m >= 0 && m < 60){
        minute = m;
    } else {
        System.out.println("Invalid number. Please check");
    }
}

public void setSecond(int s){
    if (s >= 0 && s < 60){
        second = s;
    } else {
        System.out.println("Invalid number. Please check");
    }
}

public String toString(int h, int m, int s){
    return hour + ":" + minute + ":" + second ;
    }   
}


