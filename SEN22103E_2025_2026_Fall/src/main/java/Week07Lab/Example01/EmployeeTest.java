/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Lab.Example01;

/**
 *
 * @author ali.nizam
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.firstName="Ahmet";
        e1.lastName="Ak";
        e1.displayName();
        System.out.println(e1.getName());
        e1.lengthOfEmployement=9;
       // e1.calculateNetSalary();
        System.out.println(e1.getNetSalary());
        
    }
}
