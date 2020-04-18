package application;

import entities.Address;
import entities.Course;
import entities.Student;

import java.util.ArrayList;

public class program {

    public static void main(String[] args) {
        //classes, objetos e alocacao de memoria
        Course course = new Course(1, "Sistemas de Informação");

        //classes, objetos e alocacao de memoria
        ArrayList<Address> addresses = new ArrayList<>();
        addresses.add(new Address(1, "69316.262", "Rua Macapá Nº881", "RR", "Boa Vista"));

        //classes, objetos e alocacao de memoria
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course);

        //classes, objetos e alocacao de memoria
        Student student = new Student(1, "Douglas", "Gomes", "douglas1234@gmail.com",
                "123456", addresses, 2020, 5, courses);
    }
}
