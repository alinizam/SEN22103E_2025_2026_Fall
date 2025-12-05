/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11Lab;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Factory {

    String factoryName;
    Product products[] = new Product[5];
    ArrayList<Employee> employees = new ArrayList<>();

    void addProduct(Product p, int index) {
        if (index < products.length) {
            products[index] = p;
        } else {
            System.out.println("Index out of bound");
        }
    }

    /*void removeProduct(String title){
        for (Product product : products) {
            if(product!=null && product.title.equals(title)){
                product=null;
            }
        } 
    }*/
    void removeProduct(int price) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].price > price) {
                products[i] = null;
            }
        }
    }

    void removeProduct(String title) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].title.equals(title)) {
                products[i] = null;
            }
        }
    }

    int getProductCount() {
        int count = 0;
        for (Product product : products) {
            if (product != null) {
                count++;
            }
        }
        return count;
    }

    int getProductTotalPrice() {
        int total = 0;
        for (Product product : products) {
            if (product != null) {
                total += product.price;
            }
        }
        return total;
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void removeEmployee(Employee e) {
        employees.remove(e);
    }

    int increaseProductPrice(String title, int inc) {
        int increment = 0;
        for (Product product : products) {
            if (product != null && product.title.equals(title)) {
                if (product.price < 5) {
                    product.price = product.price + inc + 2;
                    increment = increment + inc + 2;
                } else {
                    product.price = product.price + inc;
                    increment += inc;
                }
            }
        }
        return increment; 
    }

}
