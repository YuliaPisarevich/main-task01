package by.epam.javatraining.pisarevich.tasks.maintask01.view;

import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.DoubleVector;


public class Print {

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

    //Print with message

    public static void print(String message, double result) {
        result = Math.round(result * 1000D) / 1000D;
        System.out.println(message + "\n" + result);
    }

    public static void print(String message, int result) {
        System.out.println(message + "\n" + result);
    }

    public static void print(String message, boolean result) {
        System.out.println(message + "\n" + result);
    }

    public static void print(String message, DoubleVector result) {
        print(message, result.getArray());
    }

    public static void print(String message, double[] result) {
        StringBuilder builder = new StringBuilder();
        builder.append("\n");
        for (double value : result) {
            builder.append(value).append("\n");
        }
        System.out.println(message + "\n" + builder);
    }


}
