/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7Theory;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) {
        int parameter=5;
        System.out.println(parameter);
        setValue(parameter);
        System.out.println(parameter);
        Employee e1=new Employee();
        e1.salary=5000;
        changeSalary(e1);
        System.out.println(e1.salary);
        
        
    }
     //Change an existing employee's salary
    static void changeSalary(Employee e){
        e.salary=10000;
    }
    
    static void setValue(int p){
        p=10;
    }
   
}
