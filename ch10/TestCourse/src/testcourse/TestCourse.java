/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcourse;

/**
 *
 * @author kaiyan
 */
public class TestCourse 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Course course1 = new Course("data structure");
        Course course2 = new Course("database system");
        
        course1.AddStudentName("douya");
        course1.AddStudentName("yanchi");
        course1.AddStudentName("pappa");
        
        course2.AddStudentName("douya");
        course2.AddStudentName("yuanyuan");
        
        System.out.println("Number of students in course1: " + 
                course1.GetNumberOfStudents());
        String[] students = course1.GetStudents();
        for(int i = 0; i < course1.GetNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");
         
        System.out.println();
        System.out.println("Number of students in course2: " + 
                course2.GetNumberOfStudents());
    }
    
}
