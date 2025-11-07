/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7Theory;

/**
 *
 * @author ali.nizam
 */
public class Example07 {

    public static void main(String[] args) {
        // How meny elements of an array can be divided by 3

        int numbers[] = {10,9,1, 20, 15,30};
        int count = 0;
        for (int element : numbers) {
            if (element % 3 == 0) {
                count++;
            }

        }
        System.out.println("Count: " + count);

    }
}
