/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Lab;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
    public static void main(String[] args) {
        int size = 5;
        int multiplier = 3;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(i + j != size - 1)
                    System.out.print("x  ");
                else
                    System.out.print(((i + 1) * multiplier) + " ");
            }
            System.out.println("");
        }
    }
}
