/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02Lab;

/**
 *
 * @author ali.nizam
 */
public class Example04 {
    public static void main(String[] args) {
        int a=10,b=5;
        System.out.println("a: " +a+"--- b: "+b);
        a=a+b;
        b=a-b; // ((a+b)-b))
        a=a-b; // ((a+b)-a))
        System.out.println("a: " +a+"--- b: "+b);
    }
}
