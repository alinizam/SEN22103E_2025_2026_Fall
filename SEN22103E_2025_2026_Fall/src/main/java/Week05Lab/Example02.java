/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Lab;

/**
 *
 * @author ali.nizam
 */
public class Example02 {
    public static void main(String[] args) {
        int counter = 0;
        int number = 7;
        while (number > 0) {
            int bit = number & 1;
            if (bit == 1)
                counter++;
            number = number >> 1;
        }
        System.out.println(counter);
    }
}

/*1010 & 0001 = 0000
1010 >> 1 = 0101
0101 & 0001 = 0001 -> counter = 1
0101 >> 1 = 0010
0010 & 0001 = 0000
0010 >> 1 = 0001
0001 & 0001 = 0001 -> counter = 2
0001 >> 1 = 0000*/