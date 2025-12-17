/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Lab;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Factory {
    ArrayList<Employee> employees=new ArrayList<>();
    ArrayList<Manager> managers=new ArrayList<>();
    void addEmployee(String firstName, String lastName, Role r,String type, int duration){
        if (type.equals("EMPLOYEE")){
            Employee e=new Employee();
            e.firstName=firstName;
            e.lastName=lastName;
            e.role=r;
            e.workDuration=duration;
            employees.add(e);
        }else if (type.equals("MANAGER")){
            Manager m=new Manager();
            m.firstName=firstName;
            m.lastName=lastName;
            m.role=r;
            m.workDuration=duration;
            managers.add(m);
        }
    
    }
    
    void printEmployeeNumberInRole(){
        int[] roleNumbers=new int [Role.roles.length];
        for (int i = 0; i < Role.roles.length; i++) {
           for (Employee employee : employees) {
                if (employee.role.name.equals(Role.roles[i].name)){
                    roleNumbers[i]++;
                }
            } 
        }
        
        for (int i = 0; i < Role.roles.length; i++) {
           for (Manager manager : managers) {
                if (manager.role.name.equals(Role.roles[i].name)){
                    roleNumbers[i]++;
                }
            } 
        }
        for (int i = 0; i < Role.roles.length; i++) {
            System.out.println(Role.roles[i].name+" "+roleNumbers[i]);
        }
    
    }
    
    int getTotalSalary(){
        int totalSalary=0;
        for (Employee employee : employees) {
            totalSalary+=employee.getSalary();
        }
        for (Manager manager : managers) {
            totalSalary+=manager.getSalary();
        }
        return totalSalary;
    }
    
}
