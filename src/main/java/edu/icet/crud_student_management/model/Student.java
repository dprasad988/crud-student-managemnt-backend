package edu.icet.crud_student_management.model;

import lombok.Data;

@Data
public class Student {
    private Integer id;

    private String studentName;
    private String studentAge;
    private String studentContact;
    private String gurName;
    private String gurAge;
    private String gurContact;
}
