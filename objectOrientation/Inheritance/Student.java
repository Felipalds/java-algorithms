package objectOrientation.Inheritance;

public class Student extends Person {
    private int number;
    private String course;

    public Student(int number, String course) {
        this.number = number;
        this.course = course;
    }

    public void cancelCourse(){
        this.course = null;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
