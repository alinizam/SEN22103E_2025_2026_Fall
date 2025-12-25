/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Theory.Example02;

/**
 *
 * @author ali.nizams
 */
public class Test {
    public static void main(String[] args) {
        IMove car=(IMove)(new Car(10));
        car.changeLocation(50);
        System.out.println(car.getLocation());
    }
}
