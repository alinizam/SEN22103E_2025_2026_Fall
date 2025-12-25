/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Theory.Example03;

/**
 *
 * @author ali.nizam
 */
public abstract class Employee implements IOverTime{
    String firstName;
    int salary;
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public abstract void setSalary(int salary);
     public abstract int setOverTimeAmount(int i);
    
}
