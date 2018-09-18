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
public class Course 
{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;
    
    public Course(String courseName)
    {
        this.courseName = courseName;
    }
    
    public String GetCourseName()
    {
        return courseName;
    }
    
    public void AddStudentName(String name)
    {
        students[numberOfStudents] = name;
        numberOfStudents++;
    }
    
    public void DropStudents(String name)
    {
        numberOfStudents--;
    }
    
    public String[] GetStudents()
    {
        return students;
    }
    
    public int GetNumberOfStudents()
    {
        return numberOfStudents;
    }
}
