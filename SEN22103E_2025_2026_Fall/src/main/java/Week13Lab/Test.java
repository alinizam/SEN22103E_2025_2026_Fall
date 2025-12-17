/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Lab;

import java.util.Arrays;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Factory f=new Factory();
        f.addEmployee(new Employee(2000));
        f.addEmployee(new Staff(2005));
        f.addEmployee(new Staff(2000));
        f.addEmployee(new Staff(1995));
        f.addEmployee(new Clerk(2000));
        f.addEmployee(new Worker(2000));
        String typeNumbers[]=f.getEmployeeTypeNumbers();
        System.out.println(Arrays.toString(typeNumbers));
        Employee longestWorkingEmployee=f.getLongestWorkingEmployee();
        System.out.println(longestWorkingEmployee.startYear);
        
        f.addEmployee(new Employee(new Department("HR")));
        f.addEmployee(new Employee(new Department("IT")));
        f.addEmployee(new Employee(new Department("IT")));
        System.out.println(f.getEmployeeCount());
        
    }
}
