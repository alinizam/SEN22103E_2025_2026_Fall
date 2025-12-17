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
public class Galery {
    ArrayList<Car> cars=new ArrayList<>();
    ArrayList<Sedan> sedans=new ArrayList<>();
    ArrayList<Sport> sports=new ArrayList<>();  
    int getTotalPrice(){ 
            int total=0;
            for (Car car : cars) {
                total+=car.price;
            }
            for (Sedan sedan : sedans) {
                total=total+sedan.price;
            }
             for (Sport sport : sports) {
                total=total+sport.price;
            }
            return total; 
    }
    

    
}
