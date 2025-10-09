/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weeb03Lab;

/**
 *
 * @author ali.nizam
 */
public class Example3 {
    public static void main(String[] args) {
        int grade = 53;
        if (100 >= grade && grade >= 85) {
            System.out.println("AA");
        }
        else if (85 > grade && grade >= 75) {
            System.out.println("BB");
        }
        else if (75 > grade && grade >= 65) {
            System.out.println("CC");
        }
        else if (65 > grade && grade >= 55) {
            System.out.println("DD");
        }
        else if (55 > grade && grade >= 0) {
            System.out.println("FF");
        }
        else {
            System.out.println("Enter a valid grade");
        }
    }
}








