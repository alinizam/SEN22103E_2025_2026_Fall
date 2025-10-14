/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Lab;

/**
 *
 * @author ali.nizam
 */
public class Example03_1 {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 0; i <= 100; i++) {
            if(sum + i > 3000) {
                break;
            }
            sum += i;
            System.out.println("Sum at iteration " + i + " equals to " + sum);
        }
    }
}





