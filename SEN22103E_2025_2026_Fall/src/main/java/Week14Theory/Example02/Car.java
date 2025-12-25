/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14Theory.Example02;

/**
 *
 * @author ali.nizam
 */
public class Car implements ICar{
    int location;
    int speed;

    public Car(int location) {
        this.location = location;
    }

    @Override
    public void changeLocation(int x) {
        location=location+x;
    }

    @Override
    public int getLocation() {
        return location;
    }

    @Override
    public void setLocation(int x) {
        location=x;
    }

    @Override
    public void increaseSpeed() {
        speed++;
    }

    @Override
    public void decreaseSpeed() {
        speed--;
    }

    
}
