package by.epam.javatraining.pisarevich.tasks.maintask01.model.exceptions;

public class VectorException extends RuntimeException {

    public VectorException() {
    }

    public VectorException(String message) {
        super(message);
    }

    public VectorException(String message, Throwable cause) {
        super(message, cause);
    }
}

