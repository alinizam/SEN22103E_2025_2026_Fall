/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7Theory.Example08;

/**
 *
 * @author ali.nizam
 */
public class StudentTest {
    public static void main(String[] args) {
      Student[] studentArray=new Student[3];
      studentArray[0]=new Student();
      studentArray[0].grade=100;
      System.out.println(studentArray[0].grade);
      studentArray[1]=new Student();
      studentArray[1].grade=99;
      studentArray[2]=new Student();
      studentArray[2].grade=98;
      int sum=0;
      // Get the average grade of the students
      for (int i = 0; i < studentArray.length; i++) {
           sum=sum+studentArray[i].grade; 
      }
      System.out.println(sum/studentArray.length);
      
      sum=0;
      for(Student s:studentArray){
          sum+=s.grade;
      }
       System.out.println(sum/studentArray.length);
    }
}
