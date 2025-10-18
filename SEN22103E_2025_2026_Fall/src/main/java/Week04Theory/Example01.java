/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Theory;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) {
        //decide a number is prime or not
        int number=18222552; //We accept number is bigger than 2
        boolean isPrime=true;
        for (int i = 2; i <= number/2; i++) {
            //System.out.println(i);
            if(number%i==0){
                isPrime=false;
               // break;
            }
            
        }
        System.out.println("Prime or not ="+isPrime);
    }
}










