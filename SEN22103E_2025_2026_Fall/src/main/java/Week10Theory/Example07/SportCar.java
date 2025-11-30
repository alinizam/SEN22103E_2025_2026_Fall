/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10Theory.Example07;

/**
 *
 * @author ali.nizam
 */
public class SportCar {     
    final int tyreNumber;
    static final double PI;
    static{
        PI=3.14; 
        System.out.println("The Static Block is worked");
    }

    public SportCar() {
        tyreNumber=4;
    }
    
    public void setTyreNumber(int tyreNumber) {
       // this.tyreNumber = tyreNumber;
    }
    
     public int getTyreNumber() {
        final int tyre;
        tyre=5;
        
        return tyreNumber;
    }
   
 }
