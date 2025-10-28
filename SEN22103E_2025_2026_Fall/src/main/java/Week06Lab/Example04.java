/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Lab;

/**
 *
 * @author ali.nizam
 */
public class Example04 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = i; j < i + 4; j++) {
                System.out.print(j + " ");
            }
            System.out.println("\n" + (i + 4));
        }
    }
}
