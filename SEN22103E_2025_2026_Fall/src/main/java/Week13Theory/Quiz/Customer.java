/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Theory.Quiz;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Customer {
   int c_id;
   String  firstName,  lastName, Address;
   static ArrayList<Order> orders=new ArrayList<>();
   //Add a getTotalSales method to the customer class that takes the year and product name as parameters and returns the total sales amount of that product in that year. 
   int getTotalSales(int year,String productName){
       int total=0;
       for (Order order : orders) {
           for (Product product : order.products) {
               if(order.date==year && product.pName.equals(productName)){
                   //total+=order.SalesPrice*order.Unit;
                   total+=product.UnitPrice*order.Unit;
               }
           }
           
       }
       return total;
   }

    public Customer(int c_id, String firstName, String lastName) {
        this.c_id = c_id;
        this.firstName = firstName;
        this.lastName = lastName; 
    }
      
 


}
