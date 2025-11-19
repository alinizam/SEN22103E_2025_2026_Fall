/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08Midterm;

/**
 *
 * @author ali.nizam
 */
public class Question2 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            int sum=0;
            for (int j = 1; j <= n ; j++) {
                if (j <= n - i +1){
                        System.out.print((j*i)+" ");
                        sum+=(j*i);
                }else{
                        System.out.print("  ");
                } 
            }
            System.out.println("   "+sum); 
        }
    }
}
