package by.epam.javatraining.pisarevich.tasks.maintask01.controller;

import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.DoubleVector;

public class ValueToString {

    public static String toStringValue(double[] result) {
        StringBuilder builder = new StringBuilder();
        builder.append("\n");
        for (double value : result) {
            builder.append(value).append("\n");
        }
        return builder + "";
    }
    public static String toStringValue(DoubleVector result) {
        return  toStringValue(result.getArray());
    }
    public static String toStringValue(double result) {
        return Math.round(result * 1000D) / 1000D + "";
    }

}
