/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09Lab;

/**
 *
 * @author ali.nizam
 */
public class Example04_01 {
    public static void main(String[] args) {
        int multi[][] = {{2, 4, 5},{1, 3, 6},{7, 8, 0}};
        for (int[] row : multi) {
            int sum = 0;
            for (int num : row) {
                sum += num;
            }
            System.out.println(sum);
        }
    }
}
