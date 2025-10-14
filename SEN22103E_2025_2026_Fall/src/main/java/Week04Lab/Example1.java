/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Lab;

/**
 *
 * @author ali.nizam
 */
public class Example1 {

    public static void main(String[] args) {
        //100 iterations
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("------------");
        //increment by 5
        for (int i = 0; i <= 100; i = i + 5) {
            System.out.println(i);
        }
        System.out.println("------------");
        int k=0;
        while(k<=100){
            System.out.println(k);    
            k+=5;
        }
    }
}
