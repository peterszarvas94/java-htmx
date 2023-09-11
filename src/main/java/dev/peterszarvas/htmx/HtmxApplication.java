package dev.peterszarvas.htmx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class HtmxApplication {

	public static void main(String[] args) {
		SpringApplication.run(HtmxApplication.class, args);
	}

}
