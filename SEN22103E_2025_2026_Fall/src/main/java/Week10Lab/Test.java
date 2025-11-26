/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10Lab;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Factory f=new Factory();
        Employee e=new Employee();
        e.firstName="Ahmet";
        e.lastName="Ak";
        e.salary=100000;
        e.title="Manager";
        f.addEmployee(e);
       // f.displayEmployees();
        
        
        Employee e1=new Employee();
        e1.firstName="Ayşe";
        e1.lastName="Ak";
        e1.salary=150000;
        e1.title="Manager";
        f.addEmployee(e1);
        
        Employee e2=new Employee();
        e2.firstName="Ayşe";
        e2.lastName="Ak";
        e2.salary=150000;
        e2.title="Staff";
        f.addEmployee(e2);
        
        f.displayEmployees();
        System.out.println("--------------------");
        System.out.println(f.getTotalSalaryforTitle("Manager"));
        f.increateSalary("Ahmet", "Ak", 100000);
        System.out.println(f.getTotalSalaryforTitle("Manager"));
        
        Car c=new Car();
        c.price=20000;
        e.cars.add(c);
        f.displayEmployeesCArPriceExceedlimit(25000);
        
        
        
    }
}
