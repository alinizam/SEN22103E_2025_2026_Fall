/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7Theory.Example02;

/**
 *
 * @author ali.nizam
 */
public class Factory {
    //Create a car with no attribute assigned
    Car createCar(){
        Car c=new Car();
        return c;
        //return new Car();
    }
    //Create a car with maxSpeed =200
    Car createCarWithMaxSpeed200(){
        Car c=new Car();
        c.maxSpeed=200;
        return c;
    
    }
    //Create a car with special maxSpeed defined by caller
    Car createCarWithSpecialMaxSpeed(int specialMaxSpeed){
        Car c=new Car();
        c.maxSpeed=specialMaxSpeed;
        return c;
    
    }
    // Modity car with a special speed
    Car modifyCarMaxSpeed(Car c, int specialMaxSpeed){
        c.maxSpeed=specialMaxSpeed;
        return c;
    }
    void modifyCarMaxSpeedWithoutReturn(Car c, int specialMaxSpeed){
        c.maxSpeed=specialMaxSpeed; 
    }
    
    //Create a copy of existing Car as a new Object
   Car copyCar(Car source){
       Car copy=new Car();
       copy.maxSpeed=source.maxSpeed;
       return copy;
   }
    
    
}
