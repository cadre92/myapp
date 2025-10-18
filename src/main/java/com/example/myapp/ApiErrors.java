package com.example.myapp;

import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
class ApiErrors {
  @ExceptionHandler(IllegalArgumentException.class)
  ProblemDetail badArg(IllegalArgumentException ex) {
    var pd = ProblemDetail.forStatus(400);
    pd.setDetail(ex.getMessage());
    return pd;
  }
}
