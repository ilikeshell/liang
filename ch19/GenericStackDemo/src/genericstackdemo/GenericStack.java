/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericstackdemo;

/**
 *
 * @author kaiyan
 * @param <E>
 */
public class GenericStack<E> {
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
