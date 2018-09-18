/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaiyan
 */
public class TestClone {
    public static void main(String[] args) {
        House ycHouse = new House(1, 179);
        House ylHouse = (House)ycHouse.clone();
        if(ylHouse != null){
            System.out.println("The clone house'id is: " + ylHouse.getId());
            System.out.println("              area is: " + ylHouse.getArea());
            System.out.println("      created date is: " + ylHouse.getWhenDate());
            System.out.println("ycHouse toString is: " + ycHouse);
            System.out.println("ylHouse toString is: " + ylHouse);
            System.out.println(ycHouse.getWhenDate() == ylHouse.getWhenDate());
            //System.out.println(ycHouse.whenBuildDate == ylHouse.whenBuildDate);
        }
        else
            System.out.println("Clone is not successful!");
    }
}
