/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Theory;

/**
 *
 * @author ali.nizam
 */
public class Example07 {

    public static void main(String[] args) {
        int startYear = 2005;
        double salary = 8000;
        double newSalary=100000;
        if (startYear < 2010) {
            newSalary=1.1 * salary;
            if (salary <= 100000) {
                salary = 1.1 * salary;
            }
        } else {
            System.out.println(newSalary);
            salary = 1.05 * salary;
        }
        System.out.println(salary);
    }
}
