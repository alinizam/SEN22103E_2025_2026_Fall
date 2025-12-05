/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11Theory.Example04;

/**
 *
 * @author ali.nizam
 */
public class MasterStudent extends Student{
    MasterStudent(){
        super(0,0);
    }
    String calculateLetterGrade(){
        if (grade==100)
            return "AA+";
        else
            return super.calculateLetterGrade();
    }
    /*Not allowed
    void graduate(){
    
    }*/
    
}
