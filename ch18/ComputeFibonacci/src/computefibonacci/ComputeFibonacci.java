/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computefibonacci;

import java.util.Scanner;

public class ComputeFibonacci {
    private static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a index for a fibonacci number: ");
        int index = input.nextInt();
        
        System.out.println("The fibonacci number an index " + index + " is "
            + fib(index));
        System.out.println("The fibonacci fun is invoked " + count + " times");
    }
    
    public static long fib(long index){
        count++;
        if(index == 0)
            return 0;
        else if(index == 1)
            return 1;
        else 
            return fib(index - 1) + fib(index - 2);
    }
}
