/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivebinaryserach;

import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author kaiyan
 */
public class RecursiveBinarySerach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {0, 1, 2, 3, 4, 5, 5, 8, 9, 33, 99, 100};
        System.out.println(a[binarySearch(a, 33)]);
        System.out.println(a[binarySearch(a, 100)]);
    }
    
    public static int binarySearch(int[] a, int key){
        return binarySearch(a, key, 0, a.length - 1);
    }
    
    public static int binarySearch(int[] a, int key, int low, int hi){
        if (low <= hi) {
            int mid = (low + hi) / 2;
            if(key == a[mid])
                return mid;
            else if(key < a[mid])
                return binarySearch(a, key, low, mid - 1);
            else 
                return binarySearch(a, key, mid + 1, hi);
                
        }
        else
            return -1;
    }
}
