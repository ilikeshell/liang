/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxusinggenerictype;

/**
 *
 * @author kaiyan
 */
public class MaxUsingGenericType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String string = "abc";
        Integer a = 10;
        
       // max(a, string);
    }
    
    public static <E extends Comparable<E>> E max(E o1, E o2){
        if(o1.compareTo(o2) > 0)
            return o1;
        else
            return o2;
    }
}
