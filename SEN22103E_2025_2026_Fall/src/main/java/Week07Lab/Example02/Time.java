/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Lab.Example02;

/**
 *
 * @author ali.nizam
 */
public class Time {

    int hour, minute, second;

    void incSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
            }
        }
    }

    void incMinute() {

        minute++;
        if (minute == 60) {
            minute = 0;
            hour++;
        }

    }
     void incHour() {
        hour++;
        if (hour == 24) {
             hour=0;
        }

    }

    void displayTime() {
        System.out.println(hour + " : " + minute + " : " + second);
    }
}
