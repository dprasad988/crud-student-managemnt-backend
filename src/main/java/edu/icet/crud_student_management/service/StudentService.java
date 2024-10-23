package edu.icet.crud_student_management.service;

import edu.icet.crud_student_management.entity.StudentEntity;
import edu.icet.crud_student_management.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Student persist(Student student);
    public List<Student> retrive();
    public boolean delete(Integer id);
    public Student updateStudent(Integer id, Student student);
}
