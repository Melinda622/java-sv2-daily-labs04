package day01;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie=new Movie("Titanic",1997);

        movie.addActor(new Actor("Leonardo Dicaprio",1974));
        movie.addActor(new Actor("Kate Winslet",1975));
        movie.addActor(new Actor("John Doe",1964));
        movie.addActor(new Actor("Billy Zane",1952));

        System.out.println(movie.getActors().toString());

        System.out.println(movie.actorsInTheirTwenties());
    }
}
