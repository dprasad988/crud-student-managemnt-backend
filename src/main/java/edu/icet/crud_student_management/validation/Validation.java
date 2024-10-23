package edu.icet.crud_student_management.validation;

import edu.icet.crud_student_management.model.Student;

public interface Validation {
    public boolean areAllFieldsEmpty(Student student);
}
