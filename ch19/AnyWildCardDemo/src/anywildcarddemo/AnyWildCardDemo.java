/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anywildcarddemo;

/**
 *
 * @author kaiyan
 */
public class AnyWildCardDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);
        
        print(intStack);
    }
    
    public static void print(GenericStack<?> stack){
        while (!stack.isEmpty()) {            
            System.out.print(stack.pop() + " ");
        }
        //stack.push("abc");
        System.out.println("");
    }
    
}

class GenericStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    
    public GenericStack(){
        
    }
    
    public int getSize(){
        return list.size();
    }
    
    public E peek(){
        return list.get(list.size() - 1);
    }
    
    public E pop(){
        E e = list.get(list.size() - 1);
        list.remove(getSize() - 1);
        return e;
    }
    
    public void push(E e){
        list.add(e);
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    @Override
    public String toString(){
        return "Stack: " + list.toString();
    }
}
