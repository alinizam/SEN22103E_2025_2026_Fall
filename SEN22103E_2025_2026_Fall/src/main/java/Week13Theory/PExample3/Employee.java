/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Theory.PExample3;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    private int salary;
    private String firstName;

    public Employee() {
    }

    public Employee(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
    
    

    public void setSalary(int salary) {
        if (salary<0)
            System.out.println("Incorrect salary");
        else    
            this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    
    
}
