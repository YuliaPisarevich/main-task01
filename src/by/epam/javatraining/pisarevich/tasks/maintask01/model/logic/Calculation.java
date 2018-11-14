package by.epam.javatraining.pisarevich.tasks.maintask01.model.logic;

import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.DoubleVector;

import static by.epam.javatraining.pisarevich.tasks.maintask01.controller.Controller.LOG;

public class Calculation {
    //O(n)
    public static double findMaxValue(DoubleVector vector) {
        double max = vector.getArray()[0];
        for (double value : vector.getArray()) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    //O(n)
    public static double findMinValue(DoubleVector vector) {
        double min = vector.getArray()[0];
        for (double value : vector.getArray()) {
            if (value < min) {
                min = value;
            }
        }
        return min;

    }

    //O(n)
    public static double findArithmeticAverage(DoubleVector vector) {
        double sum = 0;
        for (double value : vector.getArray()) {
            sum += value;
        }
        return sum / vector.getArray().length;

    }

    //O(n)
    public static double findGeometricAverage(DoubleVector vector) {
        double sum = 1;
        for (double value : vector.getArray()) {
            sum *= value;
        }
        return Math.pow(sum, 1 / vector.getArray().length);

    }

    public static double findLocalMin(DoubleVector vector) {
        double result = 0;
        if (vector.getArray()[0] < vector.getArray()[1]) {
            result = vector.getArray()[0];
        } else {
            for (int i = 1; i < vector.getArray().length - 1; i++) {
                if (vector.getArray()[i] < vector.getArray()[i - 1] && vector.getArray()[i] < vector.getArray()[i + 1]) {
                    result = vector.getArray()[i];
                }
            }
            if (vector.getArray()[vector.getArray().length - 1] < vector.getArray()[vector.getArray().length - 2]) {
                result = vector.getArray()[vector.getArray().length - 1];
            }
        }
        return result;
    }

    //O(n)
    public static double findLocalMax(DoubleVector vector) {
        double result = 0;
        if (vector.getArray()[0] > vector.getArray()[1]) {
            result = vector.getArray()[0];
        } else {
            for (int i = 1; i < vector.getArray().length - 1; i++) {
                if (vector.getArray()[i] > vector.getArray()[i - 1] && vector.getArray()[i] > vector.getArray()[i + 1]) {
                    result = vector.getArray()[i];
                }
            }
            if (vector.getArray()[vector.getArray().length - 1] > vector.getArray()[vector.getArray().length - 2]) {
                result = vector.getArray()[vector.getArray().length - 1];
            }
        }
        return result;

    }

    //O(n/2)
    public static double[] doReverse(DoubleVector vector) {
        double buf;
        for (int i = 0; i < vector.getArray().length / 2; i++) {
            buf = vector.getArray()[i];
            vector.getArray()[i] = vector.getArray()[vector.getArray().length - i - 1];
            vector.getArray()[vector.getArray().length - i - 1] = buf;
        }
        return vector.getArray();
    }


}

