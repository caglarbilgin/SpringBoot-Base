package com.springboot.Service;

import com.springboot.Dao.StudentDao;
import com.springboot.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {

        return this.studentDao.getAllStudents();

    }

    public Student getById (int id){
        return this.studentDao.getById(id);
    }

    public void removeStudentById(int id) {
        this.studentDao.removeStudentById(id);
    }

    public void updateStudent(Student student){
        this.studentDao.updateStudent(student);
    }
}
