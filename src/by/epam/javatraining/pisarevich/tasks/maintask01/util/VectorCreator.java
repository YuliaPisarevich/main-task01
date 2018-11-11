package by.epam.javatraining.pisarevich.tasks.maintask01.util;

import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.DoubleVector;

public class VectorCreator {

    public static DoubleVector create() {
        return new DoubleVector();
    }

    public static DoubleVector create(int size) {
        return new DoubleVector(size);
    }
}
