/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststackofintegers;

/**
 *
 * @author kaiyan
 */
public class TestStackOfIntegers {
    public static void main(String args[]){
        StackOfIntegers stack = new StackOfIntegers();
        
        for(int i = 0; i < 10; i++)
            stack.push(i);
        
        System.out.println("the size of stack is: " + stack.getNumberOfStack());
        while(!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }
}
