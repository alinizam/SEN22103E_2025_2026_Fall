/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09Lab;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
    public static void main(String[] args) {
        int array[] = {1, 4, 20, 3, 7};
        int max = array[0];
        for (int num : array) {
            if (num > max)
                max = num;
        }
        System.out.println("max is: " + max);
    }
}
