/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7Theory.Example02;

/**
 *
 * @author ali.nizam
 */
public class FactoryTest {
    public static void main(String[] args) {
        Factory f=new Factory();
        Car c1=f.createCar();
        System.out.println(c1.maxSpeed);
        Car c2=f.createCarWithMaxSpeed200();
        System.out.println(c2.maxSpeed);
        
        Car c3=f.createCarWithSpecialMaxSpeed(400);
        System.out.println(c3.maxSpeed);
        
        Car c4=f.modifyCarMaxSpeed(c3, 300);
        System.out.println(c4.maxSpeed);
        
        f.modifyCarMaxSpeedWithoutReturn(c4, 250);
        System.out.println(c4.maxSpeed);
        
        Car target=f.copyCar(c4);
        System.out.println(target.maxSpeed);
        c4.maxSpeed=500;
        System.out.println(target.maxSpeed);
        System.out.println(c4);
        System.out.println(target);
        System.out.println(c4==target);
        System.out.println("----");
        Car c5=new Car();
        Car c6=f.modifyCarMaxSpeed(c5, 5);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c5==c6);
        System.out.println(c5.equals(c6));
        
    }
}
