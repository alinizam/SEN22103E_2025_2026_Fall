/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11Theory.Example02;

/**
 *
 * @author ali.nizam
 */
public class Employee {
    public int hireYear;
    private int salary;
    protected String companyName;
    int getSalary(){
        if (hireYear<2000){
            return 10000;
        }else{
            this.salary=5000;
            return 5000;
        }
    
    }
    int getEmployeeSalary(){
        Employee e=new Employee();
        return e.salary;    
    }
}
