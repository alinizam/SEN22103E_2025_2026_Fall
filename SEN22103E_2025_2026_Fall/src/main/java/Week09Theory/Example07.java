/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09Theory;

/**
 *
 * @author ali.nizam
 */
public class Example07 {
    public static void main(String[] args) {
        System.out.println(getSum(1,2,3,5,4,1)); 
        int[] numbers={1,5,6};
        System.out.println(getSum(numbers));
        System.out.println(getSum()); 
    }
    static int getSum(int... numbers){   //int[] numbers
        int sum=0;
        for (int i:numbers ) {
            System.out.println(i);
            sum+=i;
        } 
        return sum;
    }
    static int getSum1(String n, int... numbers){   //int[] numbers
        int sum=0;
        for (int i:numbers ) {
            System.out.println(i);
            sum+=i;
        } 
        return sum;
    }
    
}
