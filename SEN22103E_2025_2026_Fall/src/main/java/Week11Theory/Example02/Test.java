/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11Theory.Example02;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.hireYear=2002;
       
        System.out.println(e.getSalary());
    
        Manager m=new Manager();
        m.hireYear=2002;
        System.out.println(m.getSalary());
    
    
    }
}
