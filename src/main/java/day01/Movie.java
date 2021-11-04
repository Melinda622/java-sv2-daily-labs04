package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int releaseYear;

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public List<Actor> getActors() {
        return actors;
    }

    private List<Actor> actors = new ArrayList<>();

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public int actorsInTheirTwenties() {
        int counter = 0;

        for (Actor i : actors) {
            int age = releaseYear - i.getBirthYear();
            if (age < 30 && age >= 20) {
                counter++;
            }
        }
        return counter;
    }
}
