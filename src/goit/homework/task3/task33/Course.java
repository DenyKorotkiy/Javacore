package goit.homework.task3.task33;


public class Course {
    private int startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public Course() {
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public Course(int startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getStartDate() {
        return startDate;
    }


    public String getName() {
        return name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }
}

