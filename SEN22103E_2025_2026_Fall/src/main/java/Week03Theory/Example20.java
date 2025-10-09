/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Theory;

/**
 *
 * @author ali.nizam
 */
public class Example20 {
    public static void main(String[] args) {
        //is there any number devided by 7 in a range
        boolean isNumberDevidedBy7=false;
        for (int i = 1; i < 200000; i++) {
            if (i%7==0){
                isNumberDevidedBy7=true;
                break;
            }
            System.out.println(i);
        } 
         System.out.println(isNumberDevidedBy7);
    }
}
