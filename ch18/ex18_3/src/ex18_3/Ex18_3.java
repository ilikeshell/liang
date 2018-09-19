/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex18_3;

/**
 *
 * @author kaiyan
 */
public class Ex18_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(gcd(20, 8) + "");
    }
    
    public static int gcd(int m, int n){
        if(m % n == 0)
            return n;
        else
            return gcd(n, m % n);
    }
    
}
