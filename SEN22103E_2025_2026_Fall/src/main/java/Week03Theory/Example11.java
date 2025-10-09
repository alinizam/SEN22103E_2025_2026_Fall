/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Theory;

/**
 *
 * @author ali.nizam
 */
public class Example11 {

    public static void main(String[] args) {
        //Get the sum of numbers between 1 and 10
        int i = 1;
        int sum = 0;
        int stop = 10;
        while (i <= stop) {
            sum = sum + i;
            i++;
            System.out.println("i=" + i + " sum=" + sum);
        }
    }
}
