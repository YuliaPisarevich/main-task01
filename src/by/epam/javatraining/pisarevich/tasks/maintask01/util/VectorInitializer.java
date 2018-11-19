package by.epam.javatraining.pisarevich.tasks.maintask01.util;

import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.DoubleVector;

import java.util.Random;
import java.util.Scanner;

public class VectorInitializer {

    public static void rndInput(DoubleVector vector, int low, int high) {
        Random random = new Random();
        for (int i = 0; i < vector.getArray().length; i++) {
            double value = (random.nextDouble() * (high - low) + low);
            vector.getArray()[i] = Math.round(value * 1000D) / 1000D;
        }

    }

    public static void userInput(DoubleVector vector) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vector.getArray().length; i++) {
            vector.getArray()[i] = scanner.nextDouble();
        }
    }


}
