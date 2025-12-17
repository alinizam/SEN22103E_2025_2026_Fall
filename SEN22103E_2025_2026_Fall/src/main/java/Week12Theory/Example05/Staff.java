/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Theory.Example05;

/**
 *
 * @author ali.nizam
 */
public class Staff extends Employee{
    
    public Staff(String firstName) {
        super(firstName);
    }
    public String getFirstName() {
        return "Staff"+firstName;
    }

    public static void setCompany(String company) {
        Employee.company = company;
    }

    public static String getCompany() {
        return "FSM Software";
    }
}
