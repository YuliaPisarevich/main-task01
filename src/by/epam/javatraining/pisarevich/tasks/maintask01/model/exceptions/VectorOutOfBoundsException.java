package by.epam.javatraining.pisarevich.tasks.maintask01.model.exceptions;

public class VectorOutOfBoundsException extends VectorException {
    public VectorOutOfBoundsException() {
    }

    public VectorOutOfBoundsException(String message) {
        super(message);
    }

    public VectorOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }
}


