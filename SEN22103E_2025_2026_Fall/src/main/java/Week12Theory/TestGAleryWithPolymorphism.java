/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Theory;

/**
 *
 * @author ali.nizam
 */
public class TestGAleryWithPolymorphism {

    public static void main(String[] args) {
        GaleryWithPolymorphism g = new GaleryWithPolymorphism();
        g.addCar(new Car());
        g.addCar(new Sedan());
        g.addCar(new Sedan());
        g.addCar(new Sport());
        g.addCar(new Sport());
        g.addCar(new Sport());
        g.displayAllCarsPrice();
        System.out.println(g.getTotalPrice());
    }
}
