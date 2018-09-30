/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superwildcarddemo;

/**
 *
 * @author kaiyan
 */
public class SuperWildCardDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GenericStack<String> sourceStack = new GenericStack<>();
        GenericStack<Object> targetStack = new GenericStack<>();
        
        targetStack.push("Java");
        targetStack.push(2);
        targetStack.push(-6);
        sourceStack.push("Sun");
        
        add(sourceStack, targetStack);
        print(targetStack);
    }
    
    public static <T> void add(GenericStack<T> sourceStack, GenericStack<? super T> targetStack){
        while(!sourceStack.isEmpty()){
            targetStack.push(sourceStack.pop());
        }
        //targetStack.push("Python");
       // targetStack.push(new String("test"));
    }
    
    public static void print(GenericStack<?> stack){
        while (!stack.isEmpty()) {            
            System.out.print(stack.pop() + " ");
        }
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
