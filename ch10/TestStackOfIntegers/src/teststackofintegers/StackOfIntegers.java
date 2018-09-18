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
public class StackOfIntegers {
     private int[] elements;
     private int size;
     public static final int DEFAULT_CAPACITY = 16;
     
     StackOfIntegers(){
         this(DEFAULT_CAPACITY);
     }  
     StackOfIntegers(int capacity){
         elements = new int[capacity];
     }
     
     //push
     public void push(int value){
         if(size > elements.length){
             int[] temp = new int[2 * elements.length];
             System.arraycopy(elements, 0, temp, 0, elements.length);
             elements = temp;
         }
         elements[size] = value;
         size++;
     }
     //pop
     public int pop(){
         return elements[--size];
     }
     //top
     public int peek(){
         return elements[size-1];
     }
     //test whether is stack full
     boolean isEmpty(){
         return size == 0;
     }
     //get the number of stack
     int getNumberOfStack(){
         return size;
     }
}
