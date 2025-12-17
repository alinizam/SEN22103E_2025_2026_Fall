/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Theory.Example04;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class TestCar {

    public static void main(String[] args) {
        //Get total price of all cars.
        ArrayList cars = new ArrayList();
        cars.add(new Car(1000));
        cars.add(new Car(2000));
        cars.add("I am really a car");
        cars.add(new Car(1000));
        int sum = 0;
        for (Object car : cars) {
            if (car instanceof Car) {
                sum += ((Car) car).getPrice();
            } else {
                System.out.println(car);
            }
        }
        System.out.println("Sum : " + sum);

    }
}
