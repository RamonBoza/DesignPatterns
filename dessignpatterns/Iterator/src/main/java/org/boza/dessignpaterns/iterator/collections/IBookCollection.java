package org.boza.dessignpaterns.iterator.collections;

import org.boza.dessignpaterns.iterator.entities.Book;
import org.boza.dessignpaterns.iterator.iterator.Iterator;

public interface IBookCollection {

    /**
     * Adds a new element to the book collection
     * @param book the book to be added
     */
    void add(Book book);

    /**
     * Removes a book from the book collection
     * @param book the book to be removed
     */
    void remove(Book book);

    /**
     * Retrieves an iterator for that collection
     * @return and iterator to iterate the collection
     */
    Iterator iterator();

    /**
     * Returns the size of the collection
     */
    int size();
}
