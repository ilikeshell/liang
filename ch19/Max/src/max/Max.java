/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max;

/**
 *
 * @author kaiyan
 */
public class Max {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String string = "abc";
        Integer a = 10;
        
        max(a, string);
    }
    
    public static Comparable max(Comparable o1, Comparable o2){
        if(o1.compareTo(o2) > 0)
            return o1;
        else
            return o2;
    }
    
}
