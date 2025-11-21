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
public class Example09 {
    public static void main(String[] args) {
        ArrayList cities=new ArrayList();
        cities.add("Ankara");
        cities.add("İstanbul");
        cities.set(1, "İzmir");
        System.out.println(cities);
        cities.add(new Car());
        
    }
}
