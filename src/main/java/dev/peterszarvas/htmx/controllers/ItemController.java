package dev.peterszarvas.htmx.controllers;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dev.peterszarvas.htmx.student.Student;

@Controller
public class ItemController {
	@GetMapping("/items")
	public String items(Model model) {
		List<Student> students = List.of(
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

		model.addAttribute("items", students);
		return "items";
	}

	@PostMapping("/items")
	public String newItem(@RequestParam String text, Model model) {
		model.addAttribute("text", text);
		return "new-item";
	}

}
