/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Theory;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class GaleryWithPolymorphism {
    ArrayList<Car> cars=new ArrayList<>();
    int getTotalPrice(){ 
            int total=0;
            for (Car car : cars) {
                total+=car.getPrice();
            }
            return total; 
    }
    void addCar(Car c){
        cars.add(c);
    }
    void displayAllCarsPrice(){
        for (Car car : cars) {
            System.out.println(car.getPrice());
        }
    
    }
    

    
}
