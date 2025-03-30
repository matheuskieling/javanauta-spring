package com.javanauta.springtest.infrastructure.exceptions;

public class ConflictException extends RuntimeException {
  public ConflictException(String message) {
    super(message);
  }
  public ConflictException(String message, Throwable cause) {
    super(message, cause);
  }
}
