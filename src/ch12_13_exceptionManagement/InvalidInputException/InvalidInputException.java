package ch12_13_exceptionManagement.InvalidInputException;

public class InvalidInputException extends RuntimeException{
    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
    }
}
