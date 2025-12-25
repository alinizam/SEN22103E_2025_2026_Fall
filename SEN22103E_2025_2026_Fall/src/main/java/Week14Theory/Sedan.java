/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Theory;

/**
 *
 * @author ali.nizam
 */
public class Sedan extends Car implements IShape, ICar{
    int maxSpeed;

    public Sedan(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    @Override
    public int getArea() {
        return 1000;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed=maxSpeed;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    } 
}
