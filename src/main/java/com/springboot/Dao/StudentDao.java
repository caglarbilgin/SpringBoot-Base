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
                put(2, new Student(1, "ahmet", "computer engineer"));
                put(3, new Student(1, "mehmet", "software programmer"));
                put(4, new Student(1, "veli", "software engineer"));
                put(5, new Student(1, "ali", "software engineer"));
            }

        };
    }

    public Collection<Student> getAllStudents() {

        return this.students.values();

    }
}
