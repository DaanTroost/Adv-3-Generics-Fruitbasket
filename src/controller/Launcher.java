package controller;

import model.Apple;
import model.Banana;
import model.Fruit;
import model.FruitBasket;

import java.util.ArrayList;
import java.util.List;


public class Launcher {

    public static void main(String[] args) {
       // TODO Try and use the FruitBasket class for different kind of fruits and also for a mix of fruits
        FruitBasket<Apple> appleFruitBasket = new FruitBasket<>();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        appleFruitBasket.add(apple1);
        appleFruitBasket.add(apple3);
        appleFruitBasket.add(apple2);

        Apple appleGET = appleFruitBasket.get();

        System.out.println(appleGET);

        FruitBasket<Banana> bananaFruitBasket = new FruitBasket<>();

        Banana banana1 = new Banana();

        bananaFruitBasket.add(banana1);

        System.out.println(bananaFruitBasket.contains(banana1));
        System.out.println(bananaFruitBasket.isEmpty());
        Banana bananaGET = bananaFruitBasket.get();
        System.out.println(bananaFruitBasket.isEmpty());
        System.out.println(bananaGET);

    }
}