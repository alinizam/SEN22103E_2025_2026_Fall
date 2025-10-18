/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Theory;

/**
 *
 * @author ali.nizam
 */
public class Example10 {
    /*
    1 2 3 4
    2 4 6
    3 6 
    4 
    */
     
    public static void main(String[] args) {
        int columnTotal;
        int previousColumnTotal=1;
        for (int row = 1; row <= 4; row++) {
            columnTotal=0;
            for (int column = 1; column <= 5-row; column++) {
                System.out.print((column*row)+"  ");
            }
            System.out.println("");
        }
    }
}
