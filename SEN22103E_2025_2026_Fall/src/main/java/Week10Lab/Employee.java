/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10Lab;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    String firstName,lastName,title;
    int salary;
    ArrayList<Car> cars=new ArrayList<>();
    int getTotalCarPrice(){
        int sum=0;
        for (Car car : cars) {
            sum+=car.price;
        }
        return sum;
    }
}












