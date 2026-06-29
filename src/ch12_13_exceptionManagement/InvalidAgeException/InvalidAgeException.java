package ch12_13_exceptionManagement.InvalidAgeException;

public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(String message) {
        super(message);
    }
}
