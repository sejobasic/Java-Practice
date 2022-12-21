package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student kelly = new Student(
                    "Kelly",
                    "kelly@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );
            Student sejo = new Student(
                    "Sejo",
                    "sejo@gmail.com",
                    LocalDate.of(1993, Month.DECEMBER, 9)
            );

            repository.saveAll(
                    List.of(kelly, sejo)
            );
        };
    }
}
