/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Theory;

/**
 *
 * @author ali.nizam
 */
public class Example10 {

    public static void main(String[] args) {
        //Display odd number between 0 and 20
        int i = 1;
        int stop = 20;
        while (i <= stop) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
    }
}
