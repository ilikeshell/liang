/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basictypewrap;

import java.math.BigInteger;
import java.math.BigDecimal;

/**
 *
 * @author kaiyan
 */
public class BasicTypeWrap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //各种基本类型的最大值
        System.out.println("The maximum integer is " + Integer.MAX_VALUE);
        System.out.println("The minimum positive float is " + 
                Float.MIN_VALUE);
        System.out.println("The maximum double-precision floating-point is " 
                + Double.MAX_VALUE + "\n");
        
        //
        System.out.println(new Double(12.4).intValue());
        System.out.println(new Integer(12).doubleValue());
        System.out.println(new Integer(12).byteValue() + "\n");
        
        //test compareTo method
        System.out.println(new Double(12.4).compareTo(new Double(12.3)));
        System.out.println(new Double(12.3).compareTo(new Double(12.3)));
        System.out.println(new Double(12.3).compareTo(new Double(12.4)) + "\n");
        
        //test valueOf method
        Double doubleObject = Double.valueOf("12.4");
        Integer intObject = Integer.valueOf("12");
        
        //test parseInt
        System.out.println(Integer.parseInt("11", 2));
        System.out.println(Integer.parseInt("12", 8));
        System.out.println(Integer.parseInt("13", 10));
        System.out.println(Integer.parseInt("1A", 16));
        System.out.println(String.format("%X", 26));
        
        //
        Integer intObjectBox = 2;
        Integer[] intArray = {2, 4, 6};
        System.out.println(intArray[0] + intArray[1] + intArray[2] + "\n");
        
        //test BigInteger and BigDecimal
        System.out.println(Long.MAX_VALUE);
        BigInteger a = new BigInteger("9223372036854775807");
        BigInteger b = new BigInteger("9223372036854775807");
        BigInteger c = a.multiply(b);
        System.out.println(c);
        
        //test factorial
        System.out.println("50! is : " + factorial(50));
        
        //test String function
        System.out.println("Welcome".replace('e', 'A'));
        System.out.println("Welcome".replaceFirst("e", "AA"));
        System.out.println("Welcome".replaceAll("e", "AA"));
        
        String[] tokens = "Java#html#Python".split("#");
        for(int i = 0; i < tokens.length; i++)
            System.out.println(tokens[i]);
        
        //test String convert to char[]
        char[] chars = "douya".toCharArray();
        for(int i = 0; i < chars.length; i++)
            System.out.print(chars[i] + "");
        System.out.println();
        
        char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
        "CS3720".getChars(2, 6, dst, 4);
        for(int i = 0; i < dst.length; i++)
            System.out.print(dst[i] + "");
        System.out.println();
        System.out.println(new String(dst));
        System.out.println(String.valueOf(dst));
        
        String s = String.format("%7.2f%6d%-4s", 45.556, 14, "AB");
        System.out.println(s);
        
        //test  StringBuilder
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("Welcome");
        stringBuilder.append(" ");
        stringBuilder.append("to");
        stringBuilder.append(" ");
        stringBuilder.append("java");
        System.out.println(stringBuilder);
        /*
        stringBuilder.insert(11, "HTML and ");
        System.out.println(stringBuilder);
        stringBuilder.replace(11, 15, "RUBY");
        System.out.println(stringBuilder);
        */
        stringBuilder.delete(8, 11);
    }
    
    public static BigDecimal factorial(int n){
        BigDecimal result = new BigDecimal("1");
        for(int i = 1; i <= n; i++){
            result = result.multiply(new BigDecimal(new Integer(i).toString()));
        }
        
        return result;
    }
    
}
