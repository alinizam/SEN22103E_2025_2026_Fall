/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02Theory;

/**
 *
 * @author ali.nizam
 */
public class Example18 {
     public static void main(String[] args) {
        int grade = 70;
        if (grade >=60) {
            System.out.println("AA");
        }else if (grade >= 45) {
            System.out.println("DC");
        }else if (grade >= 50 && grade<59) {
            System.out.println("DD");
        }else if (grade < 45) {
            System.out.println("FF");
        }else{
            System.out.println("Not identified");
        }
    }
}
