/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericsort;

/**
 *
 * @author kaiyan
 */
public class GenericSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Integer[] intArray = {new Integer(2), new Integer(4), new Integer(3)};
        Integer[] intArray = {2, 4, 3};
        Double[] doubleArray = {3.4, 1.3, -22.1};
        Character[] charArray = {'A', 'J', 'R'};
        String[] stringArray = {"Tom", "Suan", "Kim", "Kab"};
        
        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);
        
        System.out.print("Sorted Integer objects: ");
        printList(intArray);
        System.out.print("Sorted Doubel objects: ");
        printList(doubleArray);
        System.out.print("Sorted Character objects: ");
        printList(charArray);
        System.out.print("Sorted String objects: ");
        printList(stringArray);
    }
    
    /** sort an array of comparable objetcs */
    public static <E extends Comparable<E>> void sort(E[] list){
        E currentMin;
        int currentMinIndex;
        
        for (int i = 0; i < list.length - 1; i++) {
            currentMin = list[i];
            currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
        }
    }
    
    /** Print an array of objects */
    public static void printList(Object[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    
}