package com.naprawnikbfr.demo.rest;

import com.naprawnikbfr.demo.entity.Student;
import com.naprawnikbfr.demo.exception.StudentErrorResponse;
import com.naprawnikbfr.demo.exception.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class StudentRestController {

    private List<Student> hardCodedList;

    //define @PostConstruct to load the data, we load it only once
    @PostConstruct
    public void loadData(){
        hardCodedList = new ArrayList<>();
        hardCodedList.add(new Student("Robert", "De Niro"));
        hardCodedList.add(new Student("Al", "Pacino"));
        hardCodedList.add(new Student("Christopher", "Walken"));
    }


    //define endpoint for "students" - return list of students
    @GetMapping("/students")

    public List<Student> getStudents(){

        return hardCodedList;
    }

    //define endpoint for "students/{studentId}" - return student at index
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        //check student against List size
        if ((studentId < 0) || (studentId >= hardCodedList.size())){
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }

        return hardCodedList.get(studentId); //happy path
    }
}
