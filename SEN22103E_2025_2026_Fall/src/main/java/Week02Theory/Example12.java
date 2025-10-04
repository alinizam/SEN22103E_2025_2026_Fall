/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02Theory;

/**
 *
 * @author ali.nizam
 */
public class Example12 {
    public static void main(String[] args) {
        
        // 1 : 00000000 00000000 00000000 00000001
        System.out.println(0b110 >> 1);
        //-1 : 11111111 11111111 11111111 11111110
        
        System.out.println(-0b110 >> 1);
        
        //-6 : 11111111 11111111 11111111 11111010
        //-0b110 >> 1 10111111 11111111 11111111 1111101
        System.out.println(-6>>>1);
        //-0b110 >>> 1: 01111111 11111111 11111111 1111101
    
    
    }
    
    
}
