/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaiyan
 */
import java.util.Date;

public class House implements Comparable<House>{
    private int id;
    private double area;
    private Date whenBuildDate;
    
    public House(int id, double area){
        this.id = id;
        this.area = area;
        whenBuildDate = new Date();
    }
    
    public int getId(){
        return id;
    }
    
    public double getArea(){
        return area;
    }
    
    public Date getWhenDate(){
        return whenBuildDate;
    }
    
    @Override
    public Object clone(){
        try {
            House retHouse = (House)super.clone();
            retHouse.whenBuildDate = (Date)getWhenDate().clone();
            return retHouse;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    
    @Override
    public int compareTo(House o){
        if(area > o.area)
            return 1;
        else if(area < o.area)
            return -1;
        else
            return 0;
    }
    
    
}
