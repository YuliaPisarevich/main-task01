package by.epam.javatraining.pisarevich.tasks.maintask01.model.exceptions;

public class ZeroLengthVectorException extends VectorException {
    public ZeroLengthVectorException() {
    }

    public ZeroLengthVectorException(String message) {
        super(message);
    }

    public ZeroLengthVectorException(String message, Throwable cause) {
        super(message, cause);
    }
}

