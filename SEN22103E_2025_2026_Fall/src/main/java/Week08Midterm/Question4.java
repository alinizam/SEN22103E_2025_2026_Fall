/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week08Midterm;

/**
 *
 * @author ali.nizam
 */
public class Question4 {
    public static void main(String[] args) {
        Product p1=new Product();
        p1.price=5000;
        Product p2=new Product();
        p2.price=5000;
        Product highest=p1.getMaxProduct(p1, p2);
        System.out.println(highest.price);
    }
}
