/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kaiyan
 */
public class TestEdible {
    public static void main(String[] args) {
        Object[] ob = {new Tiger(), new Chicken(), new Apple(), new Orange()};
        for (Object ob1 : ob) {
            if (ob1 instanceof Edible) 
                System.out.println(((Edible) ob1).howToEat());
            if (ob1 instanceof Animal) {
                System.out.println(((Animal) ob1).sound());
            }
                
        }
    }
}

abstract class Animal{
    private double weight;
    
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public abstract String sound();
}


class Chicken extends Animal implements Edible{
    @Override
    public String howToEat(){
        return "Chicken : Fry it";
    }
    
    @Override
    public String sound(){
        return "Chicken: cock-a-double-doo";
    }
}

class Tiger extends Animal{
    @Override
    public String sound(){
        return "Tiger: RROOAAR";
    }
}

abstract class Fruit implements Edible{
    
}

class Apple extends Fruit{
    @Override
    public String howToEat(){
        return "Apple: Make Apple cider";
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat(){
        return "Orange: make orange juice";
    }
}