package edu.icet.crud_student_management.entity;

import jakarta.persistence.*;
import lombok.Data;
@Table(name = "student")
@Data
@Entity
public class StudentEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Integer id;

        private String studentName;
        private String studentAge;
        private String studentContact;
        private String gurName;
        private String gurAge;
        private String gurContact;
}

