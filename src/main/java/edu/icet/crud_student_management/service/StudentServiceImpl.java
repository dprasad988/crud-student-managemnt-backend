package edu.icet.crud_student_management.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crud_student_management.entity.StudentEntity;
import edu.icet.crud_student_management.model.Student;
import edu.icet.crud_student_management.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

    private final ObjectMapper mapper;
    private final StudentRepository repository;
    @Override
    public Student persist(Student student) {
        if(student == null){
            return null;
        }
        StudentEntity studentEntity = mapper.convertValue(student, StudentEntity.class);
        StudentEntity savedStudent = repository.save(studentEntity);
        return mapper.convertValue(savedStudent, Student.class);

    }

    @Override
    public List<Student> retrive() {
        Iterable<StudentEntity> students = repository.findAll();
        List<Student> studentList = new ArrayList<>();
        for(StudentEntity studentEntity : students){
            studentList.add(mapper.convertValue(studentEntity, Student.class));
        }
        return studentList;
    }

    @Override
    public boolean delete(Integer id) {
        Optional<StudentEntity> studentEntity = repository.findById(id);
        if(studentEntity.isEmpty()) return false;
        repository.deleteById(id);
        return true;
    }

    @Override
    public Student updateStudent(Integer id, Student student) {
        StudentEntity studentEntity = mapper.convertValue(student, StudentEntity.class);
        StudentEntity existingEntity = repository.findById(id).orElse(null);
        if(existingEntity == null) return null;
        BeanUtils.copyProperties(studentEntity, existingEntity, "id");
        StudentEntity updatedEntity = repository.save(existingEntity);
        return mapper.convertValue(updatedEntity, Student.class);

    }
}
