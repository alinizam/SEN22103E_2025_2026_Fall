/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11Theory.Example04;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Student s=new Student(0, 0);
        s.grade=100;
        System.out.println(s.calculateLetterGrade());
        s.graduate();
        MasterStudent ms=new MasterStudent();
        ms.grade=100;
        System.out.println(ms.calculateLetterGrade());
        ms.graduate();
    }
}
