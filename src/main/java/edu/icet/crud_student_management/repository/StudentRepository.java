package edu.icet.crud_student_management.repository;

import edu.icet.crud_student_management.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {
}
