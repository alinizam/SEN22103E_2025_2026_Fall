/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory.Example04;

/**
 *
 * @author ali.nizam
 */
public class CarTest1 {
    public static void main(String[] args) {
         Car car1=new Car();
         car1.currentSpeed=100;
         car1.increaseSpeed();
         System.out.println(car1.currentSpeed);
         System.out.println("------");
         
         Car car2=new Car();
         car2.currentSpeed=100;
         car2.increaseSpeed();
         car2.increaseSpeed();
         
         System.out.println(car2.currentSpeed);
         System.out.println(car1.currentSpeed);

    }
}
