/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicbindingdemo;

/**
 *
 * @author kaiyan
 */
public class DynamicBindingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        m(new GraduateStudents());
        m(new Students());
        m(new Person());
        m(new Object());
    }
    
    public static void m(Object X){
        System.out.println(X.toString());
    }
    
}

class GraduateStudents extends Students{
    
}

class Students extends Person{
    @Override
    public String toString(){
        return "Students";
    }
}

class Person{
    @Override
    public String toString(){
        return "Person";
    }
}