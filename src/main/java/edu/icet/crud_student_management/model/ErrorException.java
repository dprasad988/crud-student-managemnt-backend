package edu.icet.crud_student_management.model;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class ErrorException {
    private String status;
    private String message;
}
