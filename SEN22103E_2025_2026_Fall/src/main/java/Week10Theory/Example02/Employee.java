/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10Theory.Example02;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    String firstName,lastName;
    int age;
    int salary;
    Employee(){
        System.out.println("Initialized");
    }
    
    Employee(int salary){
        if (salary<25000){
            this.salary=25000;
        }else{
            this.salary=salary;
        }
    }

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
}
