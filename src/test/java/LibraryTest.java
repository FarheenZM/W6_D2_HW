import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(1);
        book = new Book("Thriller");
    }

    @Test
    public void testBookCount(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void testAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void testCannotAddBook(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void testRemoveBook(){
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.bookCount());
    }

}
