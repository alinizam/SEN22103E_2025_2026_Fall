/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Lab;

/**
 *
 * @author ali.nizam
 */
public class Employee {

    String firstName, lastName;
    int workDuration, salary;
    Role role;
    Manager manager;
    String department;

    public Employee(String firstName, String lastName, int workDuration, int salary, Role role, Manager manager, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workDuration = workDuration;
        this.salary = salary;
        this.role = role;
        this.manager = manager;
        this.department = department;
    }

    public Employee() {
    }

    int getSalary() {
        if (workDuration < 5) {
            this.salary = 3000;
        } else {
            this.salary = 5000;
        }
        return this.salary;

    }

}
