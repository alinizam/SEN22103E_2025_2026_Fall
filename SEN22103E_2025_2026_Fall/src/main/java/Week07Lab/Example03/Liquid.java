/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week07Lab.Example03;

/**
 *
 *incHour()with a method called evaporate that reduces total volume by 1. This method should not function if totalVolume drops below 0.
with a method called increase_temperature. When called, this method should
increase temperature by 1 if the temperature is below the boiling point,
call the evaporate method if the temperature is at boiling point,
and finally return remaining volume if it is not 0, return -1 if it is.
Instantiate a Liquid object with boiling point of 100, temperature of 80 and total volume of 30. Call the increase_temperature method of this object 70 times. Print the final volume and temperature.

 */
public class Liquid {
    int temperature, totalVolume, boilingPoint;
    void increaseTemperature(){
        temperature++;
        if (temperature>=boilingPoint){
            evoporate();
        }
    }
          
    void evoporate(){
        if (totalVolume>1)
         totalVolume--;
    }
}
