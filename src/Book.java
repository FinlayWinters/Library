/**
 * Represents a book in the Library
 *
 * @author Finlay.
 * @version April 2024
 */
public class Book
{
    private String author;
    private String title;
    private String isbn;
    private boolean onLoan;

    /**
     *  Constructer for the book class
     * @param anAuthor The author of the book
     * @param aTitle The title of the book
     * @param anIsbn The ISBN of the book
     */

    public Book(String anAuthor, String aTitle, String anIsbn)

    {
        this.author = anAuthor;
        this.title = aTitle;
        this.isbn = anIsbn;

        this.onLoan = false;
    }

    /**
     * Returns the author of the book
     * @return A String representing the author of the book
     */

    public String getAuthor()
    {
        return this.author;
    }

    /**
     * the title of the book
     * @return title of the
     */
    public String GetTitle()
    {
        return this.title;
    }

    public String getIsbn()
    {
        return this.isbn;
    }

    public boolean isOnLoan()
    {
        return this.onLoan;
    }

    public void setOnLoan(boolean available)
    {
        this.onLoan = available;
    }



    public String toString() {
        String available;

        if (this.onLoan == true) {
            available = " (on Loan)";
        } else {
            available = " (available";
        }

        return "Title  " + this.GetTitle() + "author  " + this.getAuthor() + available;
    }




    }


}
