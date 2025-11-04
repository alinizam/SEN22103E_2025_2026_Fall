/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Lab.Example02;

/**
 *
 * @author ali.nizam
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ali.nizam
 */
public class Time1 {

    int hour, minute, second;

    void incSecond() {
        second++;
        if (second == 60) {
            second = 0;
            incMinute();
        }
    }

    void incMinute() {

        minute++;
        if (minute == 60) {
            minute = 0;
            incHour();
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
