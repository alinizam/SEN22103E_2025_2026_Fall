/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7Theory;

/**
 *
 * @author ali.nizam
 */
public class Example04 {
    public static void main(String[] args) {
        int[] numbers=new int[3];
        System.out.println(numbers[0]);    
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        numbers[0]=5;
        numbers[1]=15;
        numbers[2]=10;
        System.out.println(numbers[0]);    
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        //System.out.println(numbers[3]); create an error
        //display elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }



    }
}
