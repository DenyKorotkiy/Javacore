package goit.homework.task3.task31;

public class BirdSong {
    private static final String[] WORDS = {"I am walking", "I am flying", "I am singing", "I am Bird"};

    public static void main(String[] args) {
        Bird bird = new Bird();
        for (String word : WORDS) {
            bird.sing(word);
        }
    }
}

