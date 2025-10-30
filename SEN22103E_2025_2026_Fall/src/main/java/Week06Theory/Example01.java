/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Theory;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) {
        int lowerBound=15,upperBound=20;
        boolean divisible=false;
        int i=-1;
        for (i = upperBound; i >= lowerBound; i--) {
            if(i%7==0){
                divisible=true;    
                break;
            }
        }
        if(!divisible){
            System.out.println("No divisible");
        }else{
            System.out.println(i);
        }
    }
}
