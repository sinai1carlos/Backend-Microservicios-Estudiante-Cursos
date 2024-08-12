package com.microservice.student.Service;

import com.microservice.student.Model.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    List<Student> findAll();

    Optional<Student> findById(Long id);

    void save(Student student);

    List<Student> findByIdCourse(Long idCourse);
}
