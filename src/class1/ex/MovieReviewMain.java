package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {

        MovieReview movie = new MovieReview();

        movie.title = "인셉션";
        movie.review = "인생은 무한 루프";

        System.out.println("영화 제목: " + movie.title + ", 리뷰: " + movie.review);

        MovieReview movie2 = new MovieReview();

        movie2.title = "어바웃 타임";
        movie2.review = "인생 시간 영화!";

        System.out.println("영화 제목: " + movie2.title + ", 리뷰: " + movie2.review);


    }
}
