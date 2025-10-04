/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02Theory;

/**
 *
 * @author ali.nizam
 */
public class Example04 {
    public static void main(String[] args) {
        int x=1, y=2;
        int z;
        //z=(x++)+(++x);  //2,3,4
        //1+3
        //System.out.println(z);
        
        
        z=(x++)+(x++);  //2,3,4 
        System.out.println(z);
        
        
        x=1;
        z=(++x*2)+x++;
        System.out.println(x); 
        
        
    }
}
