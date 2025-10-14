/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Lab;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100 && sum + i < 3000) {
            sum += i;
            System.out.println("Sum at iteration " + i + " equals to " + sum);
            i++;
        }
        System.out.println(sum +" " + i);
    }
}
