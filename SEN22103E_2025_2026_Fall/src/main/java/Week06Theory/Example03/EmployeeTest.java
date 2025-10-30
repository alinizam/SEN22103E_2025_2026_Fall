/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Theory.Example03;

/**
 *
 * @author ali.nizam
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.firstName="Ahmet";
        e1.lastName="Ak";
        e1.salary=10000;
        //System.out.println(e1.firstName+" "+e1.lastName+" "+e1.salary);
        
        Employee e2=new Employee();
        e2.firstName="Mehmet";
        e2.lastName="Blue";
        e2.salary=10000;
        //System.out.println(e2.firstName+" "+e2.lastName+" "+e2.salary);
        
        //e1=e2;
        //System.out.println(e1.firstName+" "+e1.lastName+" "+e1.salary);
        
        e1.displayInfo();
        e2.displayInfo();
    }
}
