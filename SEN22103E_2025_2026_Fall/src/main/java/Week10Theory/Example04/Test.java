/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10Theory.Example04;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.university="İTÜ";
        
        Student s2=new Student();
        s2.university="YTÜ";
        
        Student.university="Marmara";
        
        System.out.println(s1.university);
        
    }
}
