import java.util.ArrayList;

public class Library

{
    private ArrayList<Book> books;

    public Library()
    {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a book to the libarrys collection of books
     * @param aBook the book to add to the collection
     */

    public void addbook(Book aBook)
    {
        this.books.add(aBook);
    }

    public void listBooks()
    {
        for (Book b : this.books)
        {
            System.out.println(b);
        }

    }





}
