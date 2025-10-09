/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Theory;

/**
 *
 * @author ali.nizam
 */
public class Example12 {

    public static void main(String[] args) {
        //Get the sum of numbers between 1 and 30 devided by 7
        //GEt the number of numbers between 1 and 30 devided by 7
        int i = 1;
        int sum = 0;
        int stop = 30;
        int count=0;
        while (i <= stop) {
            if (i % 7 == 0) {
                sum = sum + i;
                count++;
                System.out.println("i=" + i + " sum=" + sum);
            }
            i++; 
        }
        System.out.println("Count= "+count);
    }
}
