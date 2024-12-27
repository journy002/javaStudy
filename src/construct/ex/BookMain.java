package construct.ex;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book();
        book.displayInfo();

        Book book1 = new Book("JAVA", "황태", 456);
        book1.displayInfo();
    }
}
