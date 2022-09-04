package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student chedly = new Student(
                    // 1L,
                    "Chedly",
                    "chedly@gmail.com",
                    LocalDate.of(1999, Month.JANUARY, 7)

            );
            Student mariam = new Student(
                    // 2L,
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 7)

            );

            repository.saveAll(List.of(chedly, mariam));
        };
    }
}
