package objectOrientation.Inheritance;

public class Teacher {
    public Teacher(String speciallity, float salary) {
        this.speciallity = speciallity;
        this.salary = salary;
    }

    private String speciallity;
    private float salary;

    public void salaryIncrease(){
        this.setSalary(this.getSalary() + 100);
    }

    public String getSpeciallity() {
        return speciallity;
    }

    public void setSpeciallity(String speciallity) {
        this.speciallity = speciallity;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
