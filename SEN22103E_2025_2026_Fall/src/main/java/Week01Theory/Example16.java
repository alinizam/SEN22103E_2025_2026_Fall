/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01Theory;

/**
 *
 * @author ali.nizam
 */
public class Example16 {
    static int i=10;
    public static void main(String[] args) {
        System.out.println(i);
        int i=5;
        { 
            System.out.println(Example16.i);
            //char i=10; not allowed
            System.out.println(i);
        }
         
    }
    void aMethod(){
        System.out.println();
    }
}
