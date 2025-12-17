/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Lab;

/**
 *
 * @author ali.nizam
 */
public class Manager extends Employee{
    int commission;
    public Manager(String firstName, String lastName, int workDuration, int salary, Role role, Manager manager, String department,int commission) {
       super(firstName, lastName, workDuration, salary, role, manager, department);
       this.commission=commission;
    }

    public Manager() {
    }

    @Override
    int getSalary() {
        return super.getSalary() + this.commission; 
    }
    
    
}
