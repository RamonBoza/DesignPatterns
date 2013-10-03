package org.boza.dessignpaterns.iterator.iterator;

import org.boza.dessignpaterns.iterator.collections.impl.BookCollection;
import org.boza.dessignpaterns.iterator.entities.Book;
import org.junit.Assert;
import org.junit.Test;

public class BookingIterationTest {

    @Test
    public void testIteratorHasNoNextElementForEmptyBookCollection(){
        BookCollection collection = new BookCollection();
        Iterator<Book> iterator = collection.iterator();
        Assert.assertFalse(iterator.hasNext());
    }

    public void testIteratorHasNextThreeElements(){
        final Book book1 = new Book();
        final Book book2 = new Book();
        final Book book3 = new Book();
        Book testBook;

        BookCollection collection = initializeBookCollection(book1, book2, book3);

        Iterator<Book> iterator = collection.iterator();

        //Huge Asserts here, do not use this way, is not totally correct

        Assert.assertTrue(iterator.hasNext());
        checkBook(book1, iterator);

        Assert.assertTrue(iterator.hasNext());
        checkBook(book2, iterator);

        Assert.assertTrue(iterator.hasNext());
        checkBook(book3, iterator);

        Assert.assertFalse(iterator.hasNext());

    }

    private void checkBook(Book book1, Iterator<Book> iterator) {
        Book testBook;
        testBook = iterator.next();
        Assert.assertEquals(book1, testBook);
    }

    private BookCollection initializeBookCollection(Book book1, Book book2, Book book3) {
        BookCollection collection = new BookCollection();
        collection.add(book1);
        collection.add(book2);
        collection.add(book3);
        return collection;
    }
}
