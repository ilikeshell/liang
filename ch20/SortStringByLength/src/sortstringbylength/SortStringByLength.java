/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortstringbylength;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author kaiyan
 */
public class SortStringByLength {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] cities = {"Atlanta", "Savannah", "New York", "Dallas", "Beijing" };
        

        //Arrays.sort(cities, new StringByLengthComparator());
        
        Arrays.sort(cities, (s1, s2) -> {
            
                return s1.length() - s2.length();
        });
        
        for(String s : cities)
            System.out.print(s + "    ");
        System.out.println("");
        
     }
    public static class StringByLengthComparator implements Comparator<String>{
        @Override
        public int compare(String s1, String s2){
            if(s1.length() > s2.length())
                return 1;
            else if(s1.length() == s2.length())
                return 0;
            else 
                return -1;
        }
    }
}
