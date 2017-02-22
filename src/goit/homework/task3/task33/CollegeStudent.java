package goit.homework.task3.task33;

public class CollegeStudent extends Student {

    public CollegeStudent(String firstName, String lastName, int group) {

        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {

        super(lastName, coursesTaken);
    }
    String collegeName;
    int rating;
    long id;

    public CollegeStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public CollegeStudent(String lastName, Course[] coursesTaken, String collegeName, int rating, long id) {
        super(lastName, coursesTaken);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }
}

