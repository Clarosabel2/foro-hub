package alura.forohub.infra.errors;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity handleError404() {
        return ResponseEntity.notFound().build();
    }
    @ExceptionHandler(ValidationIntegratyException.class)
    public ResponseEntity handleError404(Exception e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
