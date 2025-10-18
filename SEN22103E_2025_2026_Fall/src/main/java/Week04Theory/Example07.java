/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Theory;

/**
 *
 * @author ali.nizam
 */
public class Example07 {
    public static void main(String[] args) {
        //in a range hom many number can be devided by 7
        
        //iterate over range
        //check if number can be decided by 7
        //store the count of number devided by 7
        
        int divisor=7;
        int start=15,stop=50;
        int count=0;
        for (int i = start; i <= stop; i++) {
            if(i%7==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
        
        
    }
}











