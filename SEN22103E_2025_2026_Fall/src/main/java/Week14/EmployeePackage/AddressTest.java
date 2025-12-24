/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14.EmployeePackage;

import Week14.JobPackage.Job;
import Week14.JobPackage.Officer;

/**
 *
 * @author ali.nizam
 */
public class AddressTest {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setFirstName("Ahmet");
        e.addresses.add("Fatih");
        e.addresses.add("Sultan");
 
        e.setJobs(new Job[]{new Officer(1000,"Developer")});
        
        Employee e1=new Employee();
        e1.setFirstName("Mehmet");
        e1.addresses.add("Eyüp");
        e1.addresses.add("Sultan");
        
        Department d=new Department();
        d.employees.add(e);
        d.employees.add(e1);
        
        d.displayOfficerAddress();
        
        
    }
}
