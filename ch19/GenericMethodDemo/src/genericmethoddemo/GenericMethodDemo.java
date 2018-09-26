/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericmethoddemo;

import sun.net.www.content.text.Generic;

/**
 *
 * @author kaiyan
 */
public class GenericMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"London", "Paris", "Berlin"};
        
        GenericMethodDemo.<Integer>print(integers);
        GenericMethodDemo.print(strings);
        print(integers);
        print(strings);
    }
    
    public static <E> void print(E[] list){
        for (int i = 0; i < list.length; i++) 
            System.out.print(list[i] + " ");
        System.out.println();
    }
    
}
