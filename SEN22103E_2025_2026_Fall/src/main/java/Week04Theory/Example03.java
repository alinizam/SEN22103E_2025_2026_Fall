/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Theory;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
 //is there any non prime number in a range (range limes are inculuded)
    public static void main(String[] args) {
        int start=10,stop=1500000;
        //check all number from start to stop
        outerLoop:
        for (int i = start; i <= stop; i++) {
            boolean isPrime=true;
            for (int j = 2; j <= i/2; j++) {
                //System.out.println("i:"+i+"- j"+j);
                if(i%j==0){
                    isPrime=false; 
                    System.out.println("There is a non prime number in my range");
                    break outerLoop;
                    //goto outerLoop;
                }
                 
            }
           
        }
         
    }
}