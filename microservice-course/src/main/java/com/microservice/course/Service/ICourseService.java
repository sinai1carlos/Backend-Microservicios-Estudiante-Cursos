package com.microservice.course.Service;

import com.microservice.course.Http.Response.StudentByCourseResponse;
import com.microservice.course.Model.Course;

import java.util.List;

public interface ICourseService {
    List<Course> findAll();
    Course findById(Long id);
    void save(Course course);

    //metodo del microservicio estudiante
    StudentByCourseResponse findStudentsByIdCourse(Long idCourse);
}
