package objectOrientation.Inheritance;

public class Employee {
    private String sector;
    private boolean working;
    public Employee(String sector, boolean working) {
        this.sector = sector;
        this.working = working;
    }
    public void changeJob(String newJob){
        this.sector = newJob;
        this.working = true;
    }
    public String getSector() {
        return sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }
    public boolean isWorking() {
        return working;
    }
    public void setWorking(boolean working) {
        this.working = working;
    }
}
