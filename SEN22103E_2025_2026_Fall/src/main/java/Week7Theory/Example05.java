/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7Theory;

/**
 *
 * @author ali.nizam
 */
public class Example05 {
    public static void main(String[] args) {
        // Get the sum of all elements in array
        int numbers[]={5,10,15};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
            System.out.println(i +": "+numbers[i]+": "+sum);
        }
        System.out.println(sum);
    }
}
