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
public class Company {
     ArrayList<Employee> employees=new ArrayList<>();
     void displayEmployeesCarPrice(){
         for (Employee e:employees){
             for (Car c:e.cars){
                    System.out.println(c.price);
             
             }
         
         }
     }
     
     
      void displayAllDriverName(){
         for (Employee e:employees){
             for (Car c:e.cars){
                    System.out.println(c.driver.fullName); 
             } 
         }
     }
}
