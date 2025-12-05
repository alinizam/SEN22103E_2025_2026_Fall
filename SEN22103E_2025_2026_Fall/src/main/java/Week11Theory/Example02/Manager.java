/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11Theory.Example02;

/**
 *
 * @author ali.nizam
 */
public class Manager extends Employee{
    //a manager has additional salary 5000
    int salary;
    int getSalary(){
        return super.getSalary()+5000;
 
    }
    
    /*suboptimal 
    int getSalary(){
        if (hireYear<2000){
            return 10000+5000;
        }else{
            return 5000+5000;
        }
    
    }*/
}
