/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10Theory.Example06;

/**
 *
 * @author ali.nizam
 */
public class Animal {
    int age;
    static String type;  

    public Animal(int age) {
        this.age = age;
    }
    
    static int getAge() {
         //return age;  not possible
         return 0;
    }
    
    String getType(){
        return type;
    }
    
    
    
}
