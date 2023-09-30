package br.com.tddjava.tddjava.services;

import br.com.tddjava.tddjava.modules.courses.entities.Course;
import br.com.tddjava.tddjava.modules.courses.services.CreateCourseService;
import org.junit.Test;

public class CreateCourseServiceTest {

    @Test
    public void should_be_able_to_create_a_new_course(){
        //Create a new course
        //Create a table course (entity)
        Course course = new Course();
        course.setDescription("Course_Description_Test");
        course.setName("Course_Name");
        course.setWorkLoad(100);

        //Create a new service
        CreateCourseService createCourseService = new CreateCourseService();
        Course createdCourse = createCourseService.execute(course);

        //Create a repository of the course

        assertNotNull(createdCourse.getId());

    }
}
