package dev.peterszarvas.htmx.api;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.peterszarvas.htmx.student.Student;

@RestController
public class StudentsController {

	@GetMapping("/api/students")
	public List<Student> index() {
		return List.of(
				new Student(
						1L,
						"Peter",
						"email@test.xcom",
						42,
						LocalDate.of(2000, Month.JANUARY, 5)),
				new Student(
						2L,
						"John",
						"johndoe@ex.com",
						69,
						LocalDate.of(2001, Month.JANUARY, 5)));
	}
}
