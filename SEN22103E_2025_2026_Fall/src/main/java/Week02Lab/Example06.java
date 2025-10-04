/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02Lab;

/**
 *
 * @author ali.nizam
 */
public class Example06 {
    public static void main(String[] args) {
        int i=154;
        int digit100=i/100;
        int digit1=i-(i/10)*10;
        int digit10=(i-(digit100*100))/10;
        int iReverse=100*digit1+10*digit10+digit100;
        System.out.println(iReverse);
        //System.out.println(digit1+""+digit10+""+digit100);
    }
}
