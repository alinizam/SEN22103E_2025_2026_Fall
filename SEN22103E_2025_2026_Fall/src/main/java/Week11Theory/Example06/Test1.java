/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11Theory.Example06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ali.nizam
 */
public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s=new Scanner(new FileInputStream("c:\\files\\numbers.txt"));
        while(s.hasNextInt()){
            System.out.println(s.nextInt());
        }
               
    }
}
