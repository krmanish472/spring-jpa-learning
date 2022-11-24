package com.example.demo.dao;

import com.example.demo.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository courseJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJpaRepository.insert(new Course(1, "Learn AWS", "in28minutes"));
        courseJpaRepository.insert(new Course(2, "Learn Node", "in28minutes"));
        courseJpaRepository.insert(new Course(3, "Learn Spring", "in28minutes"));

        courseJpaRepository.deleteById(2);

        System.out.println(courseJpaRepository.findById(1));
        System.out.println(courseJpaRepository.findById(3));
    }
}
