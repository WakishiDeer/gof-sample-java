public class App {
    public static void main(String[] args) throws Exception {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Waki No Hosomichi"));
        bookShelf.appendBook(new Book("Critique of Political Economy"));
        bookShelf.appendBook(new Book("Inside Windows 7th Edition"));
        bookShelf.appendBook(new Book("Tools and Weapons"));

        // explitly use Iterator
        Iterator<Book> itr = bookShelf.iterator();
        System.out.println("*********************");
        while(itr.hasNext()){
            Book book = itr.next();
            System.out.println(book.getName());
        }

        // alternatively use for-each
        System.out.println("*********************");
        for(Book book: bookShelf.getBooks()){
            System.out.println(book.getName());
        }
    }
}
