package com.esportfy.esportfyb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class UsuarioJaCadastradoException extends RuntimeException {
    private final int errorCode;

    public UsuarioJaCadastradoException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
    @ControllerAdvice
    public class GlobalExceptionHandler {
        @ExceptionHandler(UsuarioJaCadastradoException.class)
        public ResponseEntity<String> handlePartidaServiceException(UsuarioJaCadastradoException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.valueOf(e.getErrorCode()));
        }
    }
}
