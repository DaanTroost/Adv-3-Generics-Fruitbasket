package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daan Troost <dq.troost@st.hanze.nl>
 * Purpose of the program: implement the concept of a fruitbasket
 */
public class FruitBasket<F extends Fruit> {
    private List<F> contents;

    public FruitBasket(){
        this.contents = new ArrayList<>();
    }

    public void add(F fruit){
        contents.add(fruit);
    }

    public boolean contains(F fruit){
        return contents.contains(fruit);
    }

    public boolean isEmpty(){
        return contents.isEmpty();
    }

    public int size(){
        return contents.size();
    }

    public F get(){
        F content = contents.get(0);
        contents.remove(content);
        return content;
    }


} // end of FruitBasket