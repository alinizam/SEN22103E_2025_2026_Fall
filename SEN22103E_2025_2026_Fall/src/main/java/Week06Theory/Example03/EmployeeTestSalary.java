/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Theory.Example03;

/**
 *
 * @author ali.nizam
 */
public class EmployeeTestSalary {

    public static void main(String[] args) {
        // if employee is developer and working year is more than 10 the salary is =10000
        // if employee is developer and working year is less than or equal 10 the salary is =5000
        // For other employee types the salary is =3000
        Employee e1 = new Employee();
        e1.job = 'D';
        e1.workingYear = 8;
        if (e1.job == 'D' && e1.workingYear > 10) {
            e1.salary = 10000;
        } else if (e1.job == 'D' && e1.workingYear <= 10) {
            e1.salary = 5000;
        } else {
            e1.salary = 3000;
        }
        System.out.println(e1.salary);
        
        Employee e2 = new Employee();
        e2.job = 'C';
        e2.workingYear = 8;
        
        if (e2.job == 'D' && e2.workingYear > 10) {
            e2.salary = 10000;
        } else if (e2.job == 'D' && e2.workingYear <= 10) {
            e2.salary = 5000;
        } else {
            e2.salary = 3000;
        }
        System.out.println(e2.salary);
        
    }
}
