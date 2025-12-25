/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Theory;

/**
 *
 * @author ali.nizam
 */
public class SedanTest {
    public static void main(String[] args) {
        Sedan sedan=new Sedan(100);
        ICar car=sedan;
        System.out.println(car.getMaxSpeed());
        car.setMaxSpeed(200);
        System.out.println(car.getMaxSpeed());
        IShape shape=sedan;
        System.out.println(shape.getArea()); 
    }
}
