/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericmatrixdemo;

/**
 *
 * @author kaiyan
 * @param <E>
 */
public abstract class GenericMatrix<E extends Number> {
    /** Abstract method for adding two elements of the matrics */
    protected abstract E add(E o1, E o2);
    
    /** Abstract method for multiplying two elements of the matrics */
    protected abstract E multiply(E o1, E o2);
    
    /** Abstract method for defining zero for the matrix element */
    protected abstract E zero();
    
    /** Add two matrices */
    public E[][] addMatrix(E[][] matrix1, E[][] matrix2){
        //
        if((matrix1.length != matrix2.length) || matrix1[0].length != matrix2[0].length)
            throw new RuntimeException("The matrices do not have the same size ");
        
        E[][] result =
                (E[][])new Number[matrix1.length][matrix1[0].length];
        
        //Perform addtion
        for (int i = 0; i < matrix1.length; i++) 
            for (int j = 0; j < matrix1[i].length; j++) 
                result[i][j] = add(matrix1[i][j] , matrix2[i][j]);
        
        return result;
    }
    
    
    /** Multiply two matrices */
    public E[][] multiplyMatrix(E[][] matrix1, E[][] matrix2){
        if(matrix1[0].length != matrix2.length)
            throw new RuntimeException(
                "THe matrices do not have compatible size");
        
        //create result matrix
        E[][] result =
                (E[][]) new Number[matrix1.length][matrix2[0].length];
        
        //perform multiply
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = zero();
                
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] = add(result[i][j], multiply(matrix1[i][k], matrix2[k][j]));
                }
            
            }
        }
        
        return result;
    }
    
    
    /** Print matrices, the operator, and their operation result */
    public static void printResult(
        Number[][] m1, Number[][] m2, Number[][]m3, char op){
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) 
                System.out.print(" " + m1[i][j]);
            
            if(i == m1.length / 2)
                System.out.print("  " + op + " ");
            else
                System.out.print("    ");
            
            
            for (int j = 0; j < m2[0].length; j++) 
                System.out.print(" " + m2[i][j]);
            
            if(i == m2.length / 2)
                System.out.print("   =   ");
            else
                System.out.print("       ");
            
            for (int j = 0; j < m3.length; j++) 
                System.out.print(m3[i][j] + " ");
            
            System.out.println();
        }
    }
}



    
    