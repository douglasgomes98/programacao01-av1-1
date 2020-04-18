package application;

import entities.Address;
import entities.Course;
import entities.Student;

import java.util.ArrayList;

public class program {

    public static void main(String[] args) {

        Course course = new Course(1, "Sistemas de Informação");

        ArrayList<Address> addresses = new ArrayList<>();
        addresses.add(new Address(1, "69316.262", "Rua Macapá Nº881", "RR", "Boa Vista"));

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course);

        Student student = new Student(1, "Douglas", "Gomes", "douglasgomes.rr@gmail.com",
                "123456", addresses, 2020, 5, courses);
    }
}
