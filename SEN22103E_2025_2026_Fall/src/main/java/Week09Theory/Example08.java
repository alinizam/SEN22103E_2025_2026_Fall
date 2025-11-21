/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09Theory;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Example08 {
     public static void main(String[] args) {
         ArrayList myList=new ArrayList();
         //Create
         myList.add("Ahmet Ak");
         myList.add("Ayşe AK");
         //Read
         
         String s=(String)myList.get(0);
         System.out.println(s); 
         
         myList.remove("Ahmet Ak");
         
         for (Object object : myList) {
             System.out.println(object); 
         }
         
    }
}
