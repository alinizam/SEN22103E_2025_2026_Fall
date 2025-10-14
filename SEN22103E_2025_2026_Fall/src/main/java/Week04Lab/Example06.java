/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Lab;

/**
 *
 * @author ali.nizam
 */
public class Example06 {
    public static void main(String[] args) {
        int number=12;
        String bNumber="";
        while(number>0){
            bNumber=(number%2)+bNumber;
            //System.out.print(number%2);
            number=number/2; 
        }
        System.out.println(bNumber);
    }
         
}
