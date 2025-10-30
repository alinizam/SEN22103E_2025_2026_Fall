/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Theory;

/**
 *
 * @author ali.nizam
 */
public class Example02 {
     public static void main(String[] args) {
            int number = 10;
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    System.out.print(number + " ");
                } else if (i > j) {
                    System.out.print(i+" ");
                } else {
                    System.out.print(j+" ");
                }
            }
            number -= 2;
            System.out.println("");
        }
       
    
    }
}
