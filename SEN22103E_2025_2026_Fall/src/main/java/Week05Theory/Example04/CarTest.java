/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory.Example04;

/**
 *
 * @author ali.nizam
 */
public class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = 'T';
        car1.currentSpeed = 100;
        car1.maxSpeed = 180;

        System.out.println(car1.brand);

        Car car2 = car1;
        System.out.println(car2.maxSpeed);
        car2.maxSpeed = 200;
        System.out.println(car1.maxSpeed);
        System.out.println("-------");
        Car car3;
        car3 = car1;
        car3.maxSpeed = 500;
        System.out.println(car1.maxSpeed);
        System.out.println(car2.maxSpeed);
        System.out.println(car3.maxSpeed);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
