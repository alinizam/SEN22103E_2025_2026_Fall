/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Lab;

/**
 *
 * @author ali.nizam
 */
public class Example05 {
    public static void main(String[] args) {
        int number=12;
        int decimal=1;
        int binary=0;
        while(number>0){
            binary=binary+(decimal*(number%2));
            number=number/2;
            decimal*=10;
        }
        System.out.println(binary);
    }
}
