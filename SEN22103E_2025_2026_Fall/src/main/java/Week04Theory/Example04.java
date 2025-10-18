/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Theory;

/**
 *
 * @author ali.nizam
 */
public class Example04 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
            System.out.println("Working 1");
            System.out.println("Working 2");

        }
        System.out.println("-----");
        //Equivalent
        for (int i = 0; i < 10; i++) {
            if (i != 5) { 
                System.out.println(i);
                System.out.println("Working 1");
                System.out.println("Working 2");
                System.out.println(i);
            }
        }
    }
}
