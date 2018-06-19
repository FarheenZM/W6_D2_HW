import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.collection.size();
    }

    public void takeBook(Library library) {
        Book book = library.removeBook();
        this.collection.add(book);
    }
}
