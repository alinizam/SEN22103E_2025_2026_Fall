/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10Theory.Example03;

/**
 *
 * @author ali.nizam
 */
public class Student {
    int grade;
    public Student() {
        this.grade = 50;
    }
    public Student(int grade) {
        this.grade = grade;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Deleting");
        super.finalize(); 
    }
    
    
}
