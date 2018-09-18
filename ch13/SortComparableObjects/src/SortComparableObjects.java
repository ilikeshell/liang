/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaiyan
 */
import java.util.Arrays;
import java.math.*;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Shanghai", "Beijing", "Hangzhou", "Chengdu", "Shenzheng"};
        Arrays.sort(cities);
        System.out.print("cities' order: ");
        for (String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println();
        
        BigInteger[] hugeNumbers = {new BigInteger("2323231092923992"), 
            new BigInteger("4323231092923992"), new BigInteger("54623239292")};
        Arrays.sort(hugeNumbers);
        System.out.print("numbers' order: ");
        for (BigInteger hugeNumber : hugeNumbers) {
            System.out.print(hugeNumber + " ");
        }
    }
}
