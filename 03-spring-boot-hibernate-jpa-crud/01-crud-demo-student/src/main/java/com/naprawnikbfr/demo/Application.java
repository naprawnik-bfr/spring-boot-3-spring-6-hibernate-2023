package com.naprawnikbfr.demo;

import com.naprawnikbfr.demo.dao.StudentDAO;
import com.naprawnikbfr.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	//bean for command line runner:
	@Bean
	public CommandLineRunner commandLineRunner (StudentDAO studentDAO){ //injection of StudentDAO
		return runner -> {

//			createStudent(studentDAO);
			createMultipleStudent(studentDAO);
//			readStudent(studentDAO);
//			queryForStudents(studentDAO);
//			queryForStudentsByLastName(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
//			deleteAllStudents(studentDAO);

		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {

		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted rows: " + numRowsDeleted);

	}

	private void deleteStudent(StudentDAO studentDAO) {
		//deleting student
		System.out.println("Student " + studentDAO.delete(3) + " has been deleted");
	}

	private void updateStudent(StudentDAO studentDAO) {
		//retrieve student by id
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);
		Student studentFoundById = studentDAO.getById(studentId);

		//change firstName
		System.out.println("Updating student...");
		studentFoundById.setFirstName("Blazej");

		//update the student
		studentDAO.update(studentFoundById);

		//display the student
		System.out.println("Updated student: " + studentFoundById);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		//get a list of students
		List<Student> theStudents = studentDAO.getByLastName("Fraczek");

		//display a list of students
		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {
		//get a list of students
		List<Student> theStudents = studentDAO.getAll();

		//display a list of students
		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		//retrieve student based on the id.
		System.out.println("Retrieve a student with id 2.");
		Student myStudent = studentDAO.getById(2);

		//display student
		System.out.println("Found the student: " + myStudent);

	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		//create multiple students
		System.out.println("Creating new student object...");
		Student tempStudent1 = new Student("Blazej", "Fraczek", "bf@luv2code.com");
		Student tempStudent2 = new Student("Andrzej", "Fraczek", "af@luv2code.com");
		Student tempStudent3 = new Student("Jerzy", "Fraczek", "jf@luv2code.com");

		//save student objects
		System.out.println("Saving the student");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Blazej", "Fraczek", "bf@luv2code.com");

		//save the student object
		System.out.println("Saving the student");
		studentDAO.save(tempStudent);

		//displayed ID of the saved object
		System.out.println("Saved student. Generated ID: " + tempStudent.getId());
	}
}
