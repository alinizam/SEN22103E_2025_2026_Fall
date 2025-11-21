/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09Theory;

/**
 *
 * @author ali.nizam
 */
public class Example05 {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Car c = new Car();
        c.price = 3;
        cars[0]=c;
        cars[1]=c;
        cars[2]=c;
        int sum=0;
        cars[0].price=5;
        for (Car car:cars) {
            sum+=car.price; 
        }
        System.out.println(sum);
    }
}
