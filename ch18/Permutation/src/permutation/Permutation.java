/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutation;

/**
 *
 * @author kaiyan
 */
public class Permutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char[] array = {'A', 'B', 'C', 'D', 'E', 'F'};
        permutation(array, 0);
    }
    
    public static void swap(char[] array, int sourceIndex, int targetIndex){
        char temp;
        temp = array[sourceIndex];
        array[sourceIndex] = array[targetIndex];
        array[targetIndex] = temp;
    }
    
    public static void permutation(char[] array, int start){
        if (start == array.length - 1) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
            System.out.println();
        } 
        else {
            for(int i = start; i < array.length; i++){
                swap(array, start, i);
                permutation(array, start + 1);
                swap(array, start, i);
            }
        }
    }
}
