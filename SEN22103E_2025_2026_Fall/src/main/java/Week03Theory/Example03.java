/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Theory;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
    public static void main(String[] args) {
        int startYear=2020;
        double salary=10000;
        boolean isIncrease10Percent=(startYear<2010);
        //if (startYear<2010)
        //if (isIncrease10Percent==true){   
        if (isIncrease10Percent){
            salary=1.1*salary;
        }else{
            salary=1.05*salary;
        }
        System.out.println(salary);
        
    }
    
}
