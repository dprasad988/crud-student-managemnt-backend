package edu.icet.crud_student_management.controller;

import edu.icet.crud_student_management.exception.impl.NotFoundException;
import edu.icet.crud_student_management.model.Student;
import edu.icet.crud_student_management.service.StudentService;
import edu.icet.crud_student_management.validation.Validation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin
@Slf4j
public class StudentController {

        private final StudentService service;
        private final Validation validation;

        @PostMapping("/student")
        Student persist(@RequestBody Student student){
            if(validation.areAllFieldsEmpty(student)){
                throw new NotFoundException("All fields are required");
            }
            service.persist(student);
            log.debug("Successfully {} ", student);
            return student;
        }

        @GetMapping("/student")
        List<Student> retrive(){
            return service.retrive();
        }

        @DeleteMapping("/student/{id}")
        Boolean deleteStudent(@PathVariable Integer id){
            log.info("id {}",id);
            return service.delete(id);
        }

        @PutMapping("/student/{id}")
        Student updateStudent(@PathVariable Integer id , @RequestBody Student student){
            return service.updateStudent(id, student);
        }
}

