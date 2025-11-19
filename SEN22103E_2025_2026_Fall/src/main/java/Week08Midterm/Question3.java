/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08Midterm;

/**
 *
 * @author ali.nizam
 */
public class Question3 {
    public static void main(String[] args) {
        int y = 5;
      	int x = 5;
     	int z = 6;
      	while (z>2) {
           if (x >= y--) {
                System.out.println("x: " + x + "  y: " + y + " z: "+ z);
           }
           z = ((z - x)>>1) + y--;
           x--;
      	}
      	System.out.println("x: " + x + "  y: " + y + " z: "+ z);

    }
}
