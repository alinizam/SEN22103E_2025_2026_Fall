/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Theory;

/**
 *
 * @author ali.nizam
 */
public class Example19 {
         /* write a star at once in print or println
        *
        **
        *** 
        ****
        *****
        */
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
