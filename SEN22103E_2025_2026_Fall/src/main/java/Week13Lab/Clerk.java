/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Lab;

/**
 *
 * @author ali.nizam
 */
public class Clerk extends Staff{
     public Clerk(int startYear) {
         
        this.startYear = startYear;
    }
     
     int getCommission(){
         return 1000;
     }
}
