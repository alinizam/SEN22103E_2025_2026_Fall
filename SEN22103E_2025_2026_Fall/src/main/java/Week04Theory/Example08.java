/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Theory;

/**
 *
 * @author ali.nizam
 */
public class Example08 {
    /*
    1
    1 2
    3 6 9
    18 36 48
    */
     
    public static void main(String[] args) {
        int columnTotal;
        int previousColumnTotal=1;
        for (int row = 1; row <= 4; row++) {
            columnTotal=0;
            for (int column = 1; column <= row; column++) {
                System.out.print((column*previousColumnTotal)+"  ");
                columnTotal=columnTotal+(column*previousColumnTotal); 
            }
            previousColumnTotal=columnTotal;
            //System.out.println("\n"+previousColumnTotal);
            System.out.println("");
        }
    }
    
    
}
