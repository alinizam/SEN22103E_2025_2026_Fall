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
public class Employee {
    String firstName, lastName;
    int salary;
    ArrayList<Product> products=new ArrayList<>();

    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public Employee() {
    }
    
}
