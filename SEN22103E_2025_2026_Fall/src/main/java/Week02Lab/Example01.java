/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02Lab;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) {
        //Take as input the radius of a circle and calculate the total area of the said circle. Print your result on the screen.
        int r=6;
        final double PI=3.14;
        double area;
        area=PI*r*r;
        System.out.println("Area= "+ area);
        System.out.println("Perimeter = "+(2*PI*r));
    }
}
