package com.example.demo.controller;


import java.util.ArrayList;

public class Fruit implements Eatable{
    public String toString() {return "Fruit";}

}

class Apple extends Fruit {public String toString() {return "Apple";}}
class Grape extends Fruit {public String toString() {return "Grape";}}
class Toy {public String toString(){return "Toy";}}


class FruitBox2{
    public static void main(String... args){
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        fruitBox.add(new Apple());
    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}


class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item){list.add(item);}
    T get(int i) {return list.get(i);}
    public String toString() {return list.toString();}

}