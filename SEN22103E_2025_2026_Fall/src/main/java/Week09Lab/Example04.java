/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09Lab;

/**
 *
 * @author ali.nizam
 */
public class Example04 {
    public static void main(String[] args) {
        double sum = 0;
        int counter = 0;
        int multi[][] = {{2, 4, 5},{1, 3, 6},{7, 8, 0}};
        for (int[] row : multi) {
            for (int num : row) {
                sum += num;
                counter++;
            }
        }
        System.out.println("sum is: " + sum);
        System.out.println("average is: " + sum /counter);
    }
}
