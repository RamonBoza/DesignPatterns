package org.boza.dessignpaterns.iterator.iterator.impl;

import org.boza.dessignpaterns.iterator.entities.Book;
import org.boza.dessignpaterns.iterator.iterator.Iterator;

import java.util.List;

public final class BookIterator implements Iterator<Book> {

    private List<Book> books;

    private int index;

    public BookIterator(final List<Book> books){
        if(books == null)
            throw new NullPointerException();
        this.books = books;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return books.size() > index;
    }

    @Override
    public Book next() {
        return books.get(index);
    }
}
