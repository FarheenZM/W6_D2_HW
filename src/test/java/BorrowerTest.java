import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(10);
        book = new Book("Thriller");
    }

    @Test
    public void testBookCount(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void testTakeBook(){
        library.addBook(book);
        borrower.takeBook(library);
        assertEquals(1, borrower.bookCount());

    }
}
