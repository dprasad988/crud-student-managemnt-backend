package edu.icet.crud_student_management.exception.impl;

public class NotFoundException extends RuntimeException{
    public NotFoundException (String message){
        super(message);
    }
}
