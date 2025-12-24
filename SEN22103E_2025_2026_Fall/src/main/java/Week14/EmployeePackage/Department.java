/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14.EmployeePackage;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
class Department {
    ArrayList<Employee> employees=new ArrayList<>();
    void displayOfficerAddress(){
        for (Employee employee : employees) { 
            if (employee.isOfficer()){
                System.out.println(employee.getFirstName());
                for (String address : employee.addresses) {
                    System.out.println("-->"+address);
                }
            }
        } 
    }
}
