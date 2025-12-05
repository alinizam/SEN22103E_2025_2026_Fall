/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11Theory.Example04;

/**
 *
 * @author ali.nizam
 */
public class Student {

    String school = "FSMVÜ";
    int grade;

    Student(int x, int y) {
        System.out.println("Student object instantiated.");
    }

    String calculateLetterGrade() {
        String letterGrade = "";
        if (grade < 50) {
            letterGrade = "FF";
        } else {
            letterGrade = "AA";
        }
        return letterGrade;
    }
    
    final void graduate(){
        System.out.println("Graduated");
    }

}
