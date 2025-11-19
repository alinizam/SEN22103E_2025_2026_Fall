/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08Midterm;

/**
 *
 * @author ali.nizam
 */
public class Product {
    int price;
    String name;
    /* . Design a getMaxProduct() method that 
    accepts two products and returns a product with the higher price in the method class. Write the test code for the method. Decide on the number and types of input and output parameters.System.out.println("   "+sum);*/
    Product getMaxProduct(Product p1, Product p2){
        Product pReturn=null;
        if (p1.price>p2.price){
            pReturn=p1;
        }else{
            pReturn=p2;
        }
        return  pReturn; 
    }
    
    Product getMaxProduct1(Product p1, Product p2){
        if (p1.price>p2.price){
            return p1;
        }else{
            return p2;
        } 
    }
}
