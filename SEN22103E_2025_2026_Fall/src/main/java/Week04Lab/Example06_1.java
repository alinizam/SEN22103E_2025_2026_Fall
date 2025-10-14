/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Lab;

/**
 *
 * @author ali.nizam
 */
public class Example06_1 {
     public static void main(String[] args) {
        int number=12;
        int bNumber=0;
        int digit=1;
        while(number>0){
            bNumber=bNumber+digit*(number%2);
            number=number/2; 
            digit*=10;
        }
        System.out.println(bNumber);
    }
}
