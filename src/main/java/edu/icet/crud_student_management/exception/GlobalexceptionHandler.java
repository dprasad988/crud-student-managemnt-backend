package edu.icet.crud_student_management.exception;

import edu.icet.crud_student_management.exception.impl.NotFoundException;
import edu.icet.crud_student_management.model.ErrorException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class GlobalexceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorException> handleNotFoundException (NotFoundException ex){
        ErrorException errorException = ErrorException.builder().status("failed").message(ex.getMessage()).build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorException);

    }
}
