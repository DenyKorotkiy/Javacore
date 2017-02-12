package goit.homework.task3.task31;

public class BirdSong {
    private static final String[] WORDS = {"Word 1", "Word 2", "Word 3", "Word 4"};

    public static void main(String[] args) {
        Bird bird = new Bird();
        for (String word : WORDS) {
            bird.sing(word);
        }
        bird.sing(WORDS);
    }
}
