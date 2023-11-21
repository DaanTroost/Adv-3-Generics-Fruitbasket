package test;

import model.Apple;
import model.Banana;
import model.FruitBasket;
import model.Pear;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.management.BadAttributeValueExpException;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * Purpose of the program
 */
public class FruitBasketTest {
    FruitBasket<Apple> appleFruitBasket;
    FruitBasket<Banana> bananaFruitBasket;
    FruitBasket<Pear> pearFruitBasket;

    @Test
    void addApplesToAppleBasket(){
        createBasket("Apple");
        System.out.println(appleFruitBasket.toString());
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        appleFruitBasket.add(apple1);
        appleFruitBasket.add(apple2);
        System.out.println(appleFruitBasket.toString());
        Assertions.assertEquals("The contents of this basket are: [Fruit: Apple, Fruit: Apple]", appleFruitBasket
        .toString());
    }

//    This test should generate a compiler error if uncommented. It's kept for verification of this fact.
//    This is due to incompatible types. appleFruitBasket.add expects an Apple,not a Banana, and thus the compiler
//    fails.
//    @Test
//    void addBananasToAppleBasket(){
//        createBasket("Apple");
//        Banana banana = new Banana();
//        appleFruitBasket.add(banana);
//        Assertions.assertTrue(appleFruitBasket.isEmpty());
//    }

    @Test
    void removeApplesFromAppleBasket(){
        createBasket("Apple");
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        appleFruitBasket.add(apple1);
        appleFruitBasket.add(apple3);
        appleFruitBasket.add(apple2);
        appleFruitBasket.get();
        Assertions.assertEquals(2, appleFruitBasket.size()); //expected: apple 3 and apple 2 remain.
        appleFruitBasket.get();
        Assertions.assertEquals(1, appleFruitBasket.size()); //expected apple 2 remains.
        //debugger confirms the expected memory addresses.
    }

    private void createBasket(String type){
        switch (type){
            case "Apple":
                appleFruitBasket = new FruitBasket<>();
                break;
            case "Banana":
                bananaFruitBasket = new FruitBasket<>();
                break;
            case "Pear":
                pearFruitBasket = new FruitBasket<>();
                break;
            default:
                System.out.println("How did you manage to get to this code?");
        }
    }


} // end of FruitBasketTest