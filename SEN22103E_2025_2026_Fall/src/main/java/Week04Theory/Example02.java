/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Theory;

/**
 *
 * @author ali.nizam
 */
public class Example02 {
    //is there any prime number in a range (range limes are inculuded)
    public static void main(String[] args) {
        int start=10,stop=15;
        //check all number from start to stop
        
        for (int i = start; i <= stop; i++) {
            boolean isPrime=true;
            for (int j = 2; j <= i/2; j++) {
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.println("There is a prime number in my range");
                break;
            }
        }
         
    }
}








