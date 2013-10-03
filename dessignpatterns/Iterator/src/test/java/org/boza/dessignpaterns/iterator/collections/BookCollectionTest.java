package org.boza.dessignpaterns.iterator.collections;


import org.boza.dessignpaterns.iterator.collections.impl.BookCollection;
import org.boza.dessignpaterns.iterator.entities.Book;
import org.junit.Assert;
import org.junit.Test;

public class BookCollectionTest {

    @Test
    public void testEmptyCollection(){
        BookCollection collection = new BookCollection();
        Assert.assertEquals(0, collection.size());
    }

    @Test
    public void testThereIsOneElement(){
        BookCollection collection = new BookCollection();
        collection.add(new Book());
        Assert.assertEquals(1, collection.size());
    }
}
