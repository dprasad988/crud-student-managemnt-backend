package edu.icet.crud_student_management.validation.impl;

import edu.icet.crud_student_management.model.Student;
import edu.icet.crud_student_management.validation.Validation;

public class ValidationImpl implements Validation {
    @Override
    public boolean areAllFieldsEmpty(Student student) {
        return false;
    }
}
