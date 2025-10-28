/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Lab;

/**
 *
 * 
 * 1
 * 2 3
 * 4 5 6 
 * @author ali.nizam
 */
public class Example05 {
    public static void main(String[] args) {
        int n=5;
        int counter=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println("");
        }
    }
}
