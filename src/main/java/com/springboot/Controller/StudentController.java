package com.springboot.Controller;

import com.springboot.Entity.Student;
import com.springboot.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET) //value = "/" verirsek o path'a istek attığımız zaman getirir
    public Collection<Student> getAllStudents() {
        return this.studentService.getAllStudents();
    }

}
