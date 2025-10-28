/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week06Lab;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
    public static void main(String[] args) {
        int largestPowerOf2 = 1;
        int number = 64;
        while (number >= (largestPowerOf2 << 1)){
            largestPowerOf2 <<= 1;
        }
        System.out.println(largestPowerOf2);
    }
}

//0000 0001 = 1<<1 
//0000 0010 = 2<<1
//0000 0100 = 4<<1
//0000 1000 = 8