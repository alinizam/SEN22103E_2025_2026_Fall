/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Lab;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                if (i>=j){
                    System.out.print("_ ");
                }else{
                    System.out.print((n-i-1)+" ");
                }
            }
            System.out.println("");
        }
    }
}
