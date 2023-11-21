package model;

import java.util.ArrayList;
import java.util.Arrays;
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
        //retrieve the oldest apple (as in added to the list longest ago); removing it from the list and returning it.
        F content = contents.get(0);
        contents.remove(content);
        return content;
    }

    private String[] printContent(){
        String[] content = new String[contents.size()];
        for (int fruit = 0; fruit < contents.size(); fruit++) {
            content[fruit] = contents.get(fruit).toString();
        }
        return content;
    }

    @Override
    public String toString() {
        return String.format("The contents of this basket are: %s", Arrays.toString(printContent()));
    }
} // end of FruitBasket