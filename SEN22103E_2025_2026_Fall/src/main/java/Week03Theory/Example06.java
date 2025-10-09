/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Theory;

/**
 *
 * @author ali.nizam
 */
public class Example06 {
    public static void main(String[] args) {
        int startYear=2005;
        double salary=8000; 
        if (startYear<2010 && salary <= 10000){
            salary=1.1*salary;
        }else{
            salary=1.05*salary;
        }
        System.out.println(salary);
    }
}
