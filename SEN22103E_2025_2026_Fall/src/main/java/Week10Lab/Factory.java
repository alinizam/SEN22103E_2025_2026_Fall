/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10Lab;

/**
 *
 * @author ali.nizam
 */
public class Factory {
    Employee[] employees=new Employee[3];
    void addEmployee(Employee e){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]==null){
                employees[i]=e;
                break;
            }
        } 
    }
    
     void displayEmployees(){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null){
                System.out.println(employees[i].firstName+"-"+employees[i].lastName); 
            }
        } 
    }
    int getTotalSalaryforTitle(String title){
        int sum=0;
        for (Employee employee : employees) {
           
            if (employee!=null && employee.title.equals(title)){
                sum+=employee.salary;
            }
        }
        return sum;
        
    } 
    void increateSalary(String firstName, String lastName, int increment){
           for (Employee employee : employees) {
           
            if (employee!=null && employee.firstName.equals(firstName)
                    && employee.lastName.equals(lastName)){
                employee.salary+=increment;
            }
        }
    
    }
    
   void increateSalaryBelow(int limit, int increment){
           for (Employee employee : employees) {
           
            if (employee!=null && employee.salary<limit){
                employee.salary+=increment;
            }
        }
    
    }
     void displayEmployeesCArPriceExceedlimit(int limit){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null && employees[i].getTotalCarPrice()>limit){
                System.out.println(employees[i].firstName+"-"+employees[i].lastName); 
            }
        } 
    }
    
    
    
    
    
    
     
     
     
     
     
     
     
     
     
     
     
     
}
