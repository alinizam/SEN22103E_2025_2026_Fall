/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09Theory;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Example11 {
    public static void main(String[] args) {
        ArrayList<Car> cars=new ArrayList<>();
        Car c=new Car();
        c.price=1000;
        cars.add(c);
        Car c1=new Car();
        c1.price=2000;
        cars.add(c1);
        System.out.println(cars);
        
        int sum=0;
        for(Car car:cars){
            sum+=car.price;
        }
        System.out.println(sum);
        
        Car c2=cars.get(1);
        c2.price=5000;
        
        cars.get(1).price=5000;
        
        sum=0;
        for(Car car:cars){
            sum+=car.price;
        }
        System.out.println(sum);
        
        System.out.println(getSum(cars));
        
        
        ArrayList<Car> myCars=createCarsArrayList(10);
        System.out.println(myCars.size());
    }
    
    static int getSum(ArrayList<Car> cars){
        int sum=0;
        for(Car car:cars){
            sum+=car.price;
        }
        return sum;    
    }
    
    static ArrayList<Car> createCarsArrayList(int n){
        ArrayList<Car> cars=new ArrayList<Car>();
        for (int i = 0; i < n; i++) {
            cars.add(new Car());
        }
        return cars;
    }
}
