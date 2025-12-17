/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Theory.Example05;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Employee e=new Employee("Ahmet");
        System.out.println(e.getFirstName());
        
        Employee e1=new Staff("Mehmet");
        System.out.println(e1.getFirstName());
      
        System.out.println(e1.getCompany());
        
        
        
        
    }
}
