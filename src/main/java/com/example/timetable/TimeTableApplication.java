package com.example.timetable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TimeTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimeTableApplication.class, args);
    }

}
