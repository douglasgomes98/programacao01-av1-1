package entities;

import java.util.ArrayList;

public class Student extends User {


    private Integer year_registration;
    private Integer current_semester;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(Integer registration, String name, String last_name, String email, String password, ArrayList<Address> user_address, Integer year_registration, Integer current_semester, ArrayList<Course> courses) {
        super(registration, name, last_name, email, password, user_address);
        this.year_registration = year_registration;
        this.current_semester = current_semester;
        this.courses = courses;
    }

    public Integer getYear_registration() {
        return year_registration;
    }

    public void setYear_registration(Integer year_registration) {
        this.year_registration = year_registration;
    }

    public Integer getCurrent_semester() {
        return current_semester;
    }

    public void setCurrent_semester(Integer current_semester) {
        this.current_semester = current_semester;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
