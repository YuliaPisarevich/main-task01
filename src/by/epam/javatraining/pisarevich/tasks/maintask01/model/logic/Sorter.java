package by.epam.javatraining.pisarevich.tasks.maintask01.model.logic;

import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.DoubleVector;

public class Sorter {
    //O(n)
    private static boolean isSortedIncrease(DoubleVector vector) {
        boolean result = false;
        for (int i = 0; i < vector.getArray().length - 1; i++) {
            if (vector.getArray()[i] > vector.getArray()[i + 1]) {
                result = false;
                break;        // stop while&&&&
            }
            result = true;
        }
        return result;
    }

    //O(n)
    private static boolean isSortedDecrease(DoubleVector vector) {
        boolean result = false;
        for (int i = 0; i < vector.getArray().length - 1; i++) {
            if (vector.getArray()[i] < vector.getArray()[i + 1]) {
                result = false;
                break;
            }
            result = true;
        }
        return result;

    }

    public static boolean isSorted(DoubleVector vector) {
        return isSortedIncrease(vector) || isSortedDecrease(vector);
    }

    //O(n^2)
    public static double[] doBubbleSort(DoubleVector vector) {
        boolean isSorted = false;
        double buf;
        while (!(isSorted)) {
            isSorted = true;
            for (int i = 0; i < vector.getArray().length; i++) {
                for (int j = 1; j < vector.getArray().length - i; j++) {
                    if (vector.getArray()[j - 1] > vector.getArray()[j]) {
                        isSorted = false;
                        buf = vector.getArray()[j - 1];
                        vector.getArray()[j - 1] = vector.getArray()[j];
                        vector.getArray()[j] = buf;
//                    without using addition memory
//                    vector.getArray()[j] = vector.getArray()[j] + vector.getArray()[j + 1];
//                    vector.getArray()[j + 1] = vector.getArray()[j] - vector.getArray()[j + 1];
//                    vector.getArray()[j] = vector.getArray()[j] - vector.getArray()[j + 1];
                    }
                }
            }
        }
        return vector.getArray();
    }

    //O(n^2)
    public static double[] doInsertionSort(DoubleVector vector) {
        double buf;
        for (int i = 1; i < vector.getArray().length; i++) {
            for (int j = i; j > 0; j--) {
                if (vector.getArray()[j] < vector.getArray()[j - 1]) {
                    buf = vector.getArray()[j];
                    vector.getArray()[j] = vector.getArray()[j - 1];
                    vector.getArray()[j - 1] = buf;
                }
            }
        }
        return vector.getArray();
    }

    //O(n^2)
    public static double[] doSelectionSort(DoubleVector vector) {

        for (int i = 0; i < vector.getArray().length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < vector.getArray().length; j++)
                if (vector.getArray()[j] < vector.getArray()[index])
                    index = j;

            double smallerNumber = vector.getArray()[index];
            vector.getArray()[index] = vector.getArray()[i];
            vector.getArray()[i] = smallerNumber;
        }
        return vector.getArray();
    }

    //O(n^2)

    public static double[] doQuickSort(DoubleVector vector) {
        if (vector.getArray().length == 1) {
            return vector.getArray();
        }
        return doQuickSort(vector, 0, vector.getArray().length - 1);
    }

    private static double[] doQuickSort(DoubleVector vector, int low, int high) {
        int i = low, j = high;
        double x = vector.getArray()[low + (high - low) / 2];
        while (i <= j) {
            while (vector.getArray()[i] < x) {
                ++i;
            }
            while (vector.getArray()[j] > x) {
                --j;
            }
            if (i <= j) {
                double temp = vector.getArray()[i];
                vector.getArray()[i] = vector.getArray()[j];
                vector.getArray()[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            doQuickSort(vector, low, j);
        }
        if (i < high) {
            doQuickSort(vector, i, high);
        }
        return vector.getArray();
    }
}



