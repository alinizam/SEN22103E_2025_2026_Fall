/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weeb03Lab;

/**
 *
 * @author ali.nizam
 */
public class Example5 {

    public static void main(String[] args) {

        int a = 10, b = 15, c = 3, d = 5;
        int max = (a >= b ? a : b);
        max = (max >= c ? max : c);
        max = (max >= d ? max : d);

        System.out.println("Max =" + max);

    }
}
