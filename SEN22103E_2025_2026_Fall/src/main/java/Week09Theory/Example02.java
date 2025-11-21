/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09Theory;

/**
 *
 * @author ali.nizam
 */
public class Example02 {

    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car();
        Car c = new Car();
        c.price = 5000;
        cars[1] = c;
        int sum = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                sum += cars[i].price;
            }
        }
        System.out.println(sum);
    }
}
