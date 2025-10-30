/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Theory.Example04;

/**
 *
 * @author ali.nizam
 */
public class Car {

    int currentSpeed;
    int maxSpeed;

    //increase and return the current speed
    int increaseSpeed(int increment) {
        if (currentSpeed + increment < maxSpeed) {
            currentSpeed = currentSpeed + increment;
        }else{
            currentSpeed=maxSpeed;
            System.out.println("it is not possible to exceed max speed");
        }
        return currentSpeed;
    }
}
