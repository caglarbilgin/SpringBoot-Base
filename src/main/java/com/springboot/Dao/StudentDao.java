package com.springboot.Dao;

import com.springboot.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    public static Map<Integer, Student> students;

    static { //fake data oluşturuyoruz
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "caglar", "software engineer"));
                put(2, new Student(2, "ahmet", "computer engineer"));
                put(3, new Student(3, "mehmet", "software programmer"));
                put(4, new Student(4, "veli", "software engineer"));
                put(5, new Student(5, "ali", "software engineer"));
            }

        };
    }

    public Collection<Student> getAllStudents() {

        return this.students.values();

    }

    public Student getById (int id){

        return this.students.get(id);
    }

    public void removeStudentById(int id) {
        this.students.remove(id);
    }

    public void updateStudent(Student student){

        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(),student);
    }
}
