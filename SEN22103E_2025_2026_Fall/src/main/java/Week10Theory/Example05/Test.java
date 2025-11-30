/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10Theory.Example05;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Product p=new Product();
        new Product();
        new Product();
        new Product();
        new Product();
        new Product();
        createProduct();
        createProduct();
        createProduct();
        
        Producer producer=new Producer();
        producer.createProduct();
                
        System.out.println(Product.count);
        
        System.out.println(Product.getNumberOfProduct());
    }
    
    static void createProduct(){
        new Product();
    
    }
            
}
