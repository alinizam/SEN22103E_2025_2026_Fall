/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Theory;

/**
 *
 * @author ali.nizam
 */
public class Rectangle implements IShape{
    int a,b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public int getArea() {
        return a*b;
    }
    
}
