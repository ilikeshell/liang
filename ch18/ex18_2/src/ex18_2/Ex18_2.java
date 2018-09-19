/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex18_2;

import java.util.Scanner;

/**
 *
 * @author kaiyan
 */
public class Ex18_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a index for a fibonacci number: ");
        int index = input.nextInt();
        
        System.out.println("The fibonacci number an index " + index + " is "
            + fib(index));
    }
    
    public static long fib(long index){
        if(index == 0)
            return 0;
        else if(index == 1)
            return 1;
        else{
            int m = 0, n = 1, sum = 0;
            for (int i = 2; i <= index; i++) {
                sum = m + n;
                m = n;
                n = sum;
            }
            return sum;
        } 
            
    }
    
}
