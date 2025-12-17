/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Theory.Example04;

import java.util.ArrayList;

/**
 *
 * @author ali.nizam
 */
public class Test {

    public static void main(String[] args) {
        
        ArrayList list = new ArrayList();
        //Upcast
        list.add(1);
        list.add("Ahmet");
        list.add(3);
        list.add(3);
        int sum = 0;
        //downcast
        for (Object object : list) {
            if (object instanceof Integer) {
                sum += (Integer) object;
            }
        }
        System.out.println("Sum = "+sum);

    }
}
