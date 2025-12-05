/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11Lab;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Factory f=new Factory();
        f.addProduct(new Product("Pen",10), 0);
        f.addProduct(new Product("Pencil",3), 1);
        f.addProduct(new Product("Book",7), 3);
        f.addProduct(new Product("Eraser",10), 10);
        
        f.removeProduct("Pen");
        System.out.println(f.getProductCount());
        System.out.println(f.getProductTotalPrice());
        
        
        System.out.println(f.increaseProductPrice("Book",10));
        
    }
}
