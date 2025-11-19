/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09Lab;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) {
        int array[] = {1, 4, 2, 3, 7};
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("sum is: " + sum);
        System.out.println("average is: " + (sum / array.length));
    }
}
