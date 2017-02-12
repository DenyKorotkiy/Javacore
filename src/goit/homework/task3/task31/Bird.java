package goit.homework.task3.task31;

public class Bird {
    public void sing(String word) {
        System.out.println(word);
    }

    public void sing(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
}
