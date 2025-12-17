/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12Theory;

/**
 *
 * @author ali.nizam
 */
public class TestProblematicalDownCast {
    public static void main(String[] args) {
        Car c=new Sport();
        Sedan s=(Sedan)c;
        s.whoIam();
    }
}
