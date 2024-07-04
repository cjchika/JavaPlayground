public class MovieTestDrive {
    public static void main(String[] args) {
        Movie movieOne = new Movie();
        movieOne.title = "Things Fall Apart";
        movieOne.genre = "Fiction";
        movieOne.rating = 5;

        Movie  movieTwo = new Movie();
        movieTwo.title = "Lost in Cubicle Space";
        movieTwo.genre = "Comedy";
        movieTwo.rating = 3;

        movieTwo.playIt();
    }
}
