package by.epam.javatraining.pisarevich.tasks.maintask01.model.exceptions;

public class NegativeLengthVectorException extends VectorException {
    public NegativeLengthVectorException() {
    }

    public NegativeLengthVectorException(String message) {
        super(message);
    }

    public NegativeLengthVectorException(String message, Throwable cause) {
        super(message, cause);
    }
}
