package com.fhilype;

import java.util.List;

/*
    <T> means that the class can use Generics
*/
public class ShoppingChart<T> {

    List<T> items;

    public void addItem(T t) {
        this.items.add(t);
    }

    public List<T> getAll() {
        return this.items;
    }

}
