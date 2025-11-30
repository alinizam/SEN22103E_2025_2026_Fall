/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10Theory.Example02;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.firstName="Ahmet";
        e.lastName="Ak";
        e.age=40;
        Employee e2=new Employee("Ahmet","Ak",40);
        
        Employee e1=new Employee(25000);
        System.out.println(e1.salary);
        
        
        Employee e3=new Employee(1000);
        System.out.println(e3.salary);
        
    }
}
