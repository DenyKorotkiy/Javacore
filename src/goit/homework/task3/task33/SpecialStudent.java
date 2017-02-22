package goit.homework.task3.task33;


public class SpecialStudent extends CollegeStudent {
    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group, collegeName, rating, id);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken, String collegeName, int rating, long id) {
        super(lastName, coursesTaken, collegeName, rating, id);
    }
    private String secretKey;

    public SpecialStudent(String firstName, String lastName, int group, String secretKey) {
        super(firstName, lastName, group);
        this.secretKey = secretKey;
    }

    public SpecialStudent(String lastName, Course[] coursesTaken, String secretKey) {
        super(lastName, coursesTaken);
        this.secretKey = secretKey;
    }

    public SpecialStudent(String firstName, String lastName, int group, String collegeName, int rating, long id, String secretKey) {
        super(firstName, lastName, group, collegeName, rating, id);
        this.secretKey = secretKey;
    }

    public SpecialStudent(String lastName, Course[] coursesTaken, String collegeName, int rating, long id, String secretKey) {
        super(lastName, coursesTaken, collegeName, rating, id);
        this.secretKey = secretKey;
    }
}

