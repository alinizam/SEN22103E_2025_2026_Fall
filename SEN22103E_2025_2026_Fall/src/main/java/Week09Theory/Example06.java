/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09Theory;

/**
 *
 * @author ali.nizam
 */
public class Example06 {

    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car();
        cars[0].price = 1000;
        cars[1] = new Car();
        cars[1].price = 2000;
        cars[2] = new Car();
        cars[2].price = 3000;

        int sum = getTotalPrice(cars);
        System.out.println(sum);

        Car[] cars1 = createCarListIncludingNElements(5);
        changeThePriceOfIndisN(cars1,0,1000);
        changeThePriceOfIndisN(cars1,1,1000);
        changeThePriceOfIndisN(cars1,2,2000);
        changeThePriceOfIndisN(cars1,3,1000);
        changeThePriceOfIndisN(cars1,4,1000);
        changeThePriceOfIndisN(cars1,10,1000);
        
        System.out.println(getTotalPrice(cars1));

    }
    static void changeThePriceOfIndisN(Car[] cars, int indis, int price) {
        if (indis < cars.length) {
            cars[indis].price = price;
        }else{
            System.out.println("Out of bounds");
        }
    }
    static int getTotalPrice(Car[] myCars) {
        int sum = 0;
        for (Car myCar : myCars) {
            sum += myCar.price;
        }
        return sum;
    }

    static Car[] createCarListIncludingNElements(int n) {
        Car[] cars = new Car[n];
        for (int i = 0; i < n; i++) {
            cars[i] = new Car();
        }
        return cars;
    }



}
