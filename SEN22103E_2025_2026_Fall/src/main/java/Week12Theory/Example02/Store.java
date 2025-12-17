/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Theory.Example02;

/**
 *
 * @author ali.nizam
 */
public class Store {

    Object[] products = new Object[10];

    void addProduct(Object p) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = p;
                break;
            }
        }
    }

    void listProducts() {
        for (Object product : products) {
            if (product != null) {
                if (product instanceof Stationary)
                    ((Stationary) product).sayWhoIam();
                else if (product instanceof Drink){
                    ((Drink) product).sayWhoIam();
                }else{
                    System.out.println("Not supported");
                }
            }
        }

    }
}
