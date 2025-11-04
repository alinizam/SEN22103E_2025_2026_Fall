/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Lab.Example02;

/**
 *
 * @author ali.nizam
 */
public class TimeTest {
    public static void main(String[] args) {
        Time1 t=new Time1();
        t.hour=23;
        t.minute=59;
        t.second=55;
        for (int i = 0; i < 100; i++) {
             t.displayTime();
             t.incSecond();
           
        }
        
        
        
    }
}
