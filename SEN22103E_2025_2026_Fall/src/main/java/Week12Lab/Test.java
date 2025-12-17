/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Lab;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Factory f=new Factory();
       
        f.addEmployee("Ahmet", "Ak", new Role("CIO"), "MANAGER",8);
        f.addEmployee("Ayşe", "Ak", new Role("Staff"), "EMPLOYEE",6);
        f.addEmployee("Mehmet", "Ak", new Role("Staff"), "EMPLOYEE",3);
        f.addEmployee("Kemal", "Ak", new Role("Asistant"), "EMPLOYEE",2);
        
        f.printEmployeeNumberInRole();
        System.out.println(f.getTotalSalary());
        
    }
}
