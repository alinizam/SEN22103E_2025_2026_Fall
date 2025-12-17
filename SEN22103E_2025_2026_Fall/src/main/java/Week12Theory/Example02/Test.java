/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Theory.Example02;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Store s=new Store();
        s.addProduct(new Pencil());
        s.addProduct(new Pencil());
        s.addProduct(new Pen());
        s.addProduct(new Stationary());
        s.addProduct(new Drink());
        s.addProduct(new Object());
        s.listProducts();
    }
}
