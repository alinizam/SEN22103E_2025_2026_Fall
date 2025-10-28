/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Lab;

/**
 *
 * @author ali.nizam
 */
public class Example02 {
     public static void main(String[] args) {
        int number=566366606;
        boolean isContain3=false;
        while(number>0){
            //System.out.println(number%10);
            if (number%10==3){
                isContain3=true;
                break;
            }
            number=number/10;
        }
        if (isContain3){
            System.out.println("There is 3 in digits of number");
        }else{
            System.out.println("There is no 3 in digits of number");
        }
    }
}
