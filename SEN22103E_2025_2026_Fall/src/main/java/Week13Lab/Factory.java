/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Lab;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Factory {
    ArrayList<Employee> employees=new ArrayList<>();
    Department[] departments={new Department("IT"),new Department("HR")};
    void addEmployee(Employee e){
        employees.add(e);
    }
    
    int getHighClerkSalary(){
        int maxClerkSalary=0;
        for (Employee employee : employees) {
            if (employee instanceof Clerk 
                && employee.getSalary()+((Clerk)employee).getCommission()>maxClerkSalary){
                maxClerkSalary=employee.getSalary()+((Clerk)employee).getCommission();
            }
        }
        return maxClerkSalary;
    
    
    }
    
    ArrayList<String> getEmployeeCount(){
        ArrayList<String> deptCount=new ArrayList<>();
        int[] countofEmployees=new int[departments.length];
        int i=0;
        for (Department department : departments) {
            for (Employee employee : employees) {
                if(employee.department!=null && employee.department.name.equals(department.name)){
                    countofEmployees[i]++;
                }
            }
            i++;
        }
        for (int j = 0; j < countofEmployees.length; j++) {
            deptCount.add(departments[j].name+" "+countofEmployees[j]);
        }
        return deptCount;
    }
    Employee getLongestWorkingEmployee(){
        Employee e=employees.get(0);
        int minStartYear=e.startYear;
        for (Employee employee : employees) {
            if (employee.startYear<minStartYear){
                minStartYear=employee.startYear;
                e=employee;
            }
        }
        return e;
    }
    String [] getEmployeeTypeNumbers(){
        String [] employeeTypes=new String[4];
        int empCount=0,staffCount=0,workerCount=0,clerkCount=0;
        for (Employee employee : employees) {
            if (employee instanceof Worker)
                workerCount++;
            else if (employee instanceof Clerk)
                clerkCount++;
            else if (employee instanceof Staff)
                staffCount++;
            else if (employee instanceof Employee)
                empCount++; 
           
        }
        employeeTypes[0]="Employee "+empCount;
        employeeTypes[1]="Staff "+staffCount;
        employeeTypes[2]="Worker "+workerCount;
        employeeTypes[3]="Clerk "+clerkCount;
        
        return employeeTypes;
    }

}










