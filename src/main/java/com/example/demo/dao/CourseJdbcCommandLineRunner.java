package com.example.demo.dao;

import com.example.demo.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository courseSpringDataJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        courseSpringDataJpaRepository.save(new Course(1, "Learn AWS", "in28minutes"));
        courseSpringDataJpaRepository.save(new Course(2, "Learn Node", "in28minutes"));
        courseSpringDataJpaRepository.save(new Course(3, "Learn Spring", "in28minutes"));

        courseSpringDataJpaRepository.deleteById(2L);

        System.out.println(courseSpringDataJpaRepository.findById(1L));
        System.out.println(courseSpringDataJpaRepository.findById(3L));

        System.out.println(courseSpringDataJpaRepository.findAll());
        System.out.println(courseSpringDataJpaRepository.count());

        System.out.println(courseSpringDataJpaRepository.findByAuthor("in28minutes"));
        System.out.println(courseSpringDataJpaRepository.findByAuthor("Manish"));

        System.out.println(courseSpringDataJpaRepository.findByName("Learn Spring"));

    }
}
