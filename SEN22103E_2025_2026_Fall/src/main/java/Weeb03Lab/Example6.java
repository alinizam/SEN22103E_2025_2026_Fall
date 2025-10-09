/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weeb03Lab;

/**
 *
 * @author ali.nizam
 */
public class Example6 {
    public static void main(String[] args) {
        int number = 145;
        int digit = number % 10;
        if (digit < 5)
            number = number - digit;
        else
            number = number + (10 - digit);
        System.out.println(number);
    }
}








