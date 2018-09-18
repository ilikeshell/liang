/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computefactorial;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author kaiyan
 */
public class ComputeFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a nonnegative integer: ");
        int n = input.nextInt();
        
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
    
    public static  BigInteger factorial(int n){
        BigInteger result = BigInteger.ONE;
        
        if(n == 0)
            return BigInteger.ONE;
        else
            return result = new BigInteger(n + "").multiply(factorial(n - 1));
    }
}
