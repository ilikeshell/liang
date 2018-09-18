/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursiveselectsort;

/**
 *
 * @author kaiyan
 */
public class RecursiveSelectSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {3, 1, 9, 0, 4, 8, 100, 2, 5, 5, 99, 33};
        selectSort(a);
        for(int element : a)
            System.out.print(element + " ");
        System.out.println();
    }
    
    public static void selectSort(int[] a){
        selectSort(a, 0);
    }
    
    public static void selectSort(int[] a, int i) {
        
       // if(i == a.length - 1)
        //    return;
            
        if (i < a.length - 1) {
            int min = a[i];
            int minIndex = i;

            for (int j = i + 1; j < a.length; j++) {
                if(min > a[j]){
                    min = a[j];
                    minIndex = j;
                }
            }

            a[minIndex] = a[i];
            a[i] = min;

            selectSort(a, i + 1);
        }      
    }
}
