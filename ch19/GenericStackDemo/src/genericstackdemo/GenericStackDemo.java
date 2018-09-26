/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericstackdemo;

/**
 *
 * @author kaiyan
 */
public class GenericStackDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Berlin");
        
        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        
        System.out.println(stack1.toString());
        
        GenericStack stack = new GenericStack<String>();
        stack.push("welcome to java!");
        stack.push(new Integer(2));
    }
    
}
