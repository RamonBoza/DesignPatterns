package org.boza.dessignpaterns.iterator.iterator;


public interface Iterator<T> {

    /**
     * Checks if the iterator has more elements to look for
     * @return true if there are more elements, false otherwise
     */
    boolean hasNext();


    /**
     * @return Gets the next element for this iterator
     */
    T next();
}
