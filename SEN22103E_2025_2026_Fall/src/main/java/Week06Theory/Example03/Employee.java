/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Theory.Example03;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    String firstName,lastName;
    int salary,workingYear;
    char job;
    void displayInfo(){
        System.out.println(firstName+" "+lastName+" "+salary);
    }
    void calculateSalary(){
        if (job == 'D' && workingYear > 10) {
            salary = 10000;
        } else if (job == 'D' && workingYear <= 10) {
            salary = 5000;
        } else {
           salary = 3000;
        }
    
    }
    
    int getSalary(){
         if (job == 'D' && workingYear > 10) {
            salary = 10000;
        } else if (job == 'D' && workingYear <= 10) {
            salary = 5000;
        } else {
           salary = 3000;
        }
        return salary;
    }
    
}
