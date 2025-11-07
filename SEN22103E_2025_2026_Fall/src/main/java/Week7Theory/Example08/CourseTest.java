/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7Theory.Example08;

/**
 *
 * @author ali.nizam
 */
public class CourseTest {
    public static void main(String[] args) {
        Course courses[]=new Course[2];
        courses[0]=new Course();
        courses[0].courseName="Biology";
        courses[0].students[0]=new Student();
        courses[0].students[0].grade=100;
        courses[0].students[1]=new Student();
        courses[0].students[1].grade=95;
        courses[0].students[2]=new Student();
        courses[0].students[2].grade=90;
        
        courses[1]=new Course();
        courses[1].courseName="Math";
        courses[1].students[0]=new Student();
        courses[1].students[0].grade=90;
        courses[1].students[1]=new Student();
        courses[1].students[1].grade=80;
        courses[1].students[2]=new Student();
        courses[1].students[2].grade=100;
        
        //Get the average of courses
        int sum;
        for (int i = 0; i < courses.length; i++) {
            sum=0;
            for (int j = 0; j < courses[i].students.length; j++) {
               sum=sum+courses[i].students[j].grade; 
            }
            System.out.println(courses[i].courseName+": "+(sum/courses[i].students.length));
        }
         
    }
}
