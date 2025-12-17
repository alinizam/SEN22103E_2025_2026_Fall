/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Lab;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    int startYear;
    Department department;
    int salary;

    public int getSalary() {
        return salary;
    }
    
    public Employee(int startYear) {
        this.startYear = startYear;
    }
    
    public Employee() {
    }

    public Employee( Department department) {
        this.department = department;
    }
    
    
}
