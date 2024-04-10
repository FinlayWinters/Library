/**
 * Provides a user interface for the Library Staff
 */

public class UserInterface
{
    private Library library;
    private InputReader inputReader;

    public UserInterface()
    {
        this.library = new Library();
        this.inputReader = new InputReader();
    }


    /**
     * provides a main menu for the appliaction
     */
    public void mainMenu()
    {
        boolean quit = false;

        while (quit == false)
        {
            System.out.println("please choose: ");
            System.out.println("1. Add a book ");
            System.out.println("2. List of all books ");
            System.out.println("0. Quit ");

            String userInput = inputReader.getInput();

            switch (userInput)
            {
                case "1":
                  this.addbook();
                case "2":
                   this.ListAllBooks();
                    break;
                case "0":
                    quit = true;
                    break;
                default:
                     System.out.println("Thats not a valid option");
            }

        }


    }

    public void addbook()
    {
        System.out.println("please enter the author of the book: ");
        String author = this.inputReader.getInput();

        System.out.println("please enter titile of the book");
        String title = this.inputReader.getInput();

        System.out.println("Please enter your ISBN");
        String isbn = this.inputReader.getInput();

        Book b = new(author, title, isbn);
        this.library.addbook(b);

        public void listAllBooks()
        {
            this.library.listBooks();

        }
    }
















}
