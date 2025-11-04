/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Lab.Example03;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Liquid l=new Liquid();
        l.boilingPoint=100;
        l.temperature=98;
        l.totalVolume=50;
        l.increaseTemperature();
        System.out.println(l.totalVolume+" "+l.temperature);
        l.increaseTemperature();
        System.out.println(l.totalVolume+" "+l.temperature);
    }
}
