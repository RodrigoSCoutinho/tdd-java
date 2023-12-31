package br.com.tddjava.tddjava.modules.courses.services;


import org.springframework.stereotype.Service;

import br.com.tddjava.tddjava.modules.courses.entities.Course;

import br.com.tddjava.tddjava.modules.courses.repositories.ICourseRepository;

@Service
public class CreateCourseService {

    private ICourseRepository repository;

    public CreateCourseService(ICourseRepository repository) {
        this.repository = repository;
    }

    public Course execute(Course course) {

        Course existedCourse = this.repository.findByName(course.getName());

        if (existedCourse != null) {
            throw new Error("Curso já existe!");
        }

        return this.repository.save(course);

    }

}