/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaiyan
 */
import java.util.Scanner;
public class ComputeAverage 
{
    public static void main(String args[])
    {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please input 3 numbers: \n");
        double average = input.nextDouble();
        average += input.nextDouble();
        average += input.nextDouble();
        average = average / 3.0;
        System.out.println("The average is : " + average);
    }
}
