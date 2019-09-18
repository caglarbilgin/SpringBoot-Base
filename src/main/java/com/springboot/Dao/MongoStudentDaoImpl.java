package com.springboot.Dao;

import com.springboot.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements StudentDao {


    //Connection MongoConnection;

    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>(){
            {
                add(new Student(1,"deneme","deneme course"));
            }

        };
    }

    @Override
    public Student getById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudent(Student student) {

    }
}
