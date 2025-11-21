/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09Theory;

/**
 *
 * @author ali.nizam
 */
public class Example01_1 {
    public static void main(String[] args) {
        int[][] numbers={{1,3},{1,7,2},{8}};
        int sum=0;
        for (int[] elements:numbers) {
            for (int n:elements) {
                sum+=n;
            }
        }
        System.out.println(sum);
    }
}
