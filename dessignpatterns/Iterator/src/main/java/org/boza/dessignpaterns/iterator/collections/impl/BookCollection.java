package org.boza.dessignpaterns.iterator.collections.impl;

import org.boza.dessignpaterns.iterator.collections.IBookCollection;
import org.boza.dessignpaterns.iterator.entities.Book;
import org.boza.dessignpaterns.iterator.iterator.Iterator;
import org.boza.dessignpaterns.iterator.iterator.impl.BookIterator;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements IBookCollection {

    private List<Book> array;

    public BookCollection(){
        this.array = new ArrayList<Book>();
    }

    @Override
    public void add(final Book book){
        array.add(book);
    }

    @Override
    public void remove(final Book book){
        array.remove(book);
    }

    @Override
    public Iterator iterator(){
        return new BookIterator(array);
    }

    @Override
    public int size() {
        return array.size();
    }
}
