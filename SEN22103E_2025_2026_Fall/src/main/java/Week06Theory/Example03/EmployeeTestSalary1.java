/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Theory.Example03;

/**
 *
 * @author ali.nizam
 */
public class EmployeeTestSalary1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.job = 'D';
        e1.workingYear = 8;
        e1.calculateSalary();
        System.out.println(e1.salary);
        
        Employee e2 = new Employee();
        e2.job = 'C';
        e2.workingYear = 8;
        //e2.calculateSalary();
        System.out.println(e2.getSalary());
    }
}
