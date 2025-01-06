package sparta01.extends01.superEx;

public class ShopMain {
    public static void main(String[] args) {

        Book book = new Book("JAVA", 12000, "OH", "12345");
        Album album = new Album("앨범1", 15000, "SEO");
        Movie movie = new Movie("영화1", 18000, "Oh", "seok");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("총 합: " + sum);

    }
}
