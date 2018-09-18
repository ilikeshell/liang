/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerofhanoi;

/**
 *
 * @author kaiyan
 */
public class TowerOfHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("the moves are:");
        movedisks(100, 'A', 'B', 'C');
    }
    
    public static void movedisks(
            int n, char fromTower, char toTower, char auxTower){
        if(n == 1)
            System.out.println("move disk " + n + " from " + fromTower + " to " + toTower);
        else{
            movedisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("move disk " + n + " from " + fromTower + " to " + toTower);
            movedisks(n - 1, auxTower, toTower, fromTower);
        }
    }
}
