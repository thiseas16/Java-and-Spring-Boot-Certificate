package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {

		return runner -> {
//			createStudent(studentDAO);
//			createMultipleStudent(studentDAO);
			readStudent(studentDAO);
		};
	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Retrieving student with id 3");
		Student myStudent = studentDAO.findById(3);

		System.out.println("Found the student: " + myStudent);
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		System.out.println("Creating 3 new student objects ...");
		Student tempStudent1 = new Student("Nick", "Outsos", "nick@gmail.com");
		Student tempStudent2 = new Student("Kostas", "Kardivourkos", "kardivourkos@gmail.com");
		Student tempStudent3 = new Student("Giannis", "Kaladas", "kaladas@gmail.com");

		System.out.println("Saving new students ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);


		System.out.println("Saved student 1. Generated id:" + tempStudent1.getId());
		System.out.println("Saved student 2. Generated id:" + tempStudent2.getId());
		System.out.println("Saved student 3. Generated id:" + tempStudent3.getId());


	}

	private void createStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");

		// save the student object
		System.out.println("Saving new student ...");
		studentDAO.save(tempStudent);


		// display id of the saved student
		System.out.println("Saved student. Generated id:" + tempStudent.getId());

	}

}
