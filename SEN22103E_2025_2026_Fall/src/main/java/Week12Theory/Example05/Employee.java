/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Theory.Example05;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    static String company;
    String firstName;

    public Employee(String firstName) {
        this.firstName = firstName;
    }
    

    public String getFirstName() {
        return "Employee "+ firstName;
    }

    public static void setCompany(String company) {
        Employee.company = company;
    }

    public static String getCompany() {
        return "FSM";
    }
    
}
