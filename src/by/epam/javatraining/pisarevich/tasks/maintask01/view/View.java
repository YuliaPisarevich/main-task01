package by.epam.javatraining.pisarevich.tasks.maintask01.view;

import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.DoubleVector;

public class View {

    public static void print(double result) {
        result = Math.round(result * 1000D) / 1000D;
        System.out.println(result);
    }

    public static void print(int result) {
        System.out.println(result);
    }

    public static void print(boolean result) {
        System.out.println(result);
    }

    public static void print(DoubleVector result) {
        print(result.getArray());
    }

    public static void print(double[] result) {
        StringBuilder builder = new StringBuilder();
        builder.append("\n");
        for (double value : result) {
            builder.append(value).append("\n");
        }
        System.out.println(builder);
    }
}
