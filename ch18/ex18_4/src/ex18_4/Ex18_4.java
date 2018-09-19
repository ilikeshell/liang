/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex18_4;

/**
 *
 * @author kaiyan
 */
public class Ex18_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(m(10) + "");
        System.out.println(m2(10) + "");
    }
    
    public static double m(int i){
        if(i == 1)
            return 1.0;
        else
            return 1.0/i + m(i - 1);
    }
    
    public static double m2(int i){
        double sum = 0;
        for (int j = 1; j <= 10; j++) {
            sum += 1.0 / j;
        }
        return sum;
    }
    
}
