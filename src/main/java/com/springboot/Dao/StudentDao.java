package com.springboot.Dao;

import com.springboot.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudent(Student student);
}
