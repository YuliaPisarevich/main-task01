package by.epam.javatraining.pisarevich.tasks.maintask01.model.logic;

import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.DoubleVector;

import java.util.Arrays;

public class Sorter {
    //O(n)
    public static boolean isSortedIncrease(DoubleVector vector) {
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
    public static DoubleVector doBubbleSort(DoubleVector vector) {
        boolean isSorted = false;
        double buf;
        int i = 0;

        while (i < vector.getArray().length && !(isSorted)) {
            if (!(isSorted)) {
                isSorted = true;
            }

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
            i++;
        }
        return vector;
    }

    //O(n^2)
    public static DoubleVector doInsertionSort(DoubleVector vector) {
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
        return vector;
    }

    //O(n^2)
    public static DoubleVector doSelectionSort(DoubleVector vector) {

        for (int i = 0; i < vector.getArray().length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < vector.getArray().length; j++)
                if (vector.getArray()[j] < vector.getArray()[index])
                    index = j;

            double smallerNumber = vector.getArray()[index];
            vector.getArray()[index] = vector.getArray()[i];
            vector.getArray()[i] = smallerNumber;
        }
        return vector;
    }

    //O(n^2)

    public static DoubleVector doQuickSort(DoubleVector vector) {
        if (vector.getArray().length == 1) {
            return vector;
        }
        return doQuickSort(vector, 0, vector.getArray().length - 1);
    }



    public static DoubleVector sortMergeSort(DoubleVector vector) {
        int len = vector.getArray().length;
        int n = 1;          // кратность сравнений (сравнивать по 1-му элем., 2-м ...)
        int shift;          // сдвиг в перебираемом массиве
        int two_size;          // количество элементов для 2-го массива
        double[] arr2;
        while (n < len) {
            shift = 0;
            while (shift < len) {
                if (shift + n >= len) break;
                two_size = (shift + n * 2 > len) ? (len - (shift + n)) : n;
                arr2 = merge(Arrays.copyOfRange(vector.getArray(), shift, shift + n),
                        Arrays.copyOfRange(vector.getArray(), shift + n, shift + n + two_size));
                for (int i = 0; i < n + two_size; ++i)
                    vector.getArray()[shift + i] = arr2[i]; // замена на отсортированное
                shift += n * 2;
            }
            n *= 2;
        }
        return vector;
    }
    private static double[] merge(double[] arr1, double[] arr2) {
        int lengthFirst = arr1.length;
        int lengthSecond = arr2.length;
        int a = 0;
        int b = 0;
        int len = lengthFirst + lengthSecond;
        double[] result = new double[len];
        for (int i = 0; i < len; i++) {             // a, b - счетчики в массивах
            if (b < lengthSecond && a < lengthFirst) {
                if (arr1[a] > arr2[b]) {
                    result[i] = arr2[b++];
                } else {
                    result[i] = arr1[a++];
                }
            } else if (b < lengthSecond) {
                result[i] = arr2[b++];
            } else {
                result[i] = arr1[a++];
            }
        }
        return result;
    }
    private static DoubleVector doQuickSort(DoubleVector vector, int low, int high) {
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
        return vector;
    }
}



