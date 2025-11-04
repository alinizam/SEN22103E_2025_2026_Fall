/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Lab.Example01;

/**
 *
 * @author ali.nizam
 */
public class Employee {

    String firstName, lastName;
    private int netSalary; 
    int lengthOfEmployement;
    private int age;
    

    void displayName() {
        System.out.println(firstName + " " + lastName);
    }

    String getName() {
        return firstName + " " + lastName;
    }

    void calculateNetSalary() {
        if (lengthOfEmployement < 10) {
            netSalary = 3000;
        } else {
            netSalary = 5000;
        }
    }
     
    
    int calculateNetSalaryandReturn() {
        if (lengthOfEmployement < 10) {
            netSalary = 3000;
        } else {
            netSalary = 5000;
        }
        return netSalary;
    }
    
    void setNetSalary(int nSalary){
        netSalary=nSalary;
    }
    
    int getNetSalary(){
        if (lengthOfEmployement < 10) {
            netSalary = 3000;
        } else {
            netSalary = 5000;
        }
        return netSalary; 
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
