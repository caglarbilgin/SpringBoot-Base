package com.springboot.Dao;

import com.springboot.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakeData")
public class FakeStudentDaoImpl implements StudentDao {

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

    @Override
    public Collection<Student> getAllStudents() {

        return this.students.values();

    }

    @Override
    public Student getById(int id){

        return this.students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student){

        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(),student);
    }

    @Override
    public void insertStudent(Student student) {
        this.students.put(student.getId(),student);
    }
}
