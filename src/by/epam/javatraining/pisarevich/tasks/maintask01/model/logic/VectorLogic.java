package by.epam.javatraining.pisarevich.tasks.maintask01.model.logic;

public class VectorLogic {
    public static double findMaxValue(double[] vector) {
        double max = vector[0];
        for(double temp: vector){
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    public static double findMinValue(double[] vector) {
        double min = vector[0];
        for(double temp: vector){
            if (temp < min) {
                min = temp;
            }
        }
        return min;

    }

    public static double findArithmeticAverage(double[] vector) {
        double sum = 0;
        for(double temp: vector){
            sum += temp;
        }
        return sum / vector.length;
    }

    public static double findGeometricAverage(double[] vector) {
        double sum = 1;
        for(double temp: vector) {
            if (temp <= 0) {
                System.out.println("geometric average mean for positive numbers only");
                return -1;
            }
            sum *= temp;
        }
        return Math.pow(sum, 1 / vector.length);

    }

    private static boolean isSortedIncrease(double[] vector) {
        boolean result = false;
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] > vector[i + 1]) {
                result = false;
                break;        // stop while&&&&
            }
            result = true;
        }
        return result;
    }

    private static boolean isSortedDecrease(double[] vector) {
        boolean result = false;
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] < vector[i + 1]) {
                result = false;
                break;
            }
            result = true;
        }
        return result;
    }

    public static boolean isSorted(double[] vector) {
        return isSortedIncrease(vector) || isSortedDecrease(vector);
    }

    public static double findLocalMin(double[] vector) {
        double result = 0;
        if (vector[0] < vector[1]) {
            result = vector[0];
        } else {
            for (int i = 1; i < vector.length - 1; i++) {
                if (vector[i] < vector[i - 1] && vector[i] < vector[i + 1]) {
                    result = vector[i];
                }
            }
            if (vector[vector.length - 1] < vector[vector.length - 2]) {
                result = vector[vector.length - 1];
            }
        }
        return result;
    }

    public static double findLocalMax(double[] vector) {
        double result = 0;
        if (vector[0] > vector[1]) {
            result = vector[0];
        } else {
            for (int i = 1; i < vector.length - 1; i++) {
                if (vector[i] > vector[i - 1] && vector[i] > vector[i + 1]) {
                    result = vector[i];
                }
            }
            if (vector[vector.length - 1] > vector[vector.length - 2]) {
                result = vector[vector.length - 1];
            }
        }
        return result;
    }
    //O(n)
    public static int linearSearch(double[] vector, double searchValue) {
        for (int i = 0; i < vector.length; i++) {
            if (searchValue == vector[i]) {
                return i;
            }
        }
        return -1;
    }
    //O(log(n))
    public static int binarySearch(double[] vector, double searchValue) {
        int low = 0;
        int high = vector.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (searchValue == vector[mid]) {
                return mid;
            } else if (searchValue > vector[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static double[] reverse(double[] vector) {
        double buf;
        for (int i = 0; i < vector.length / 2; i++) {
            buf = vector[i];
            vector[i] = vector[vector.length - i - 1];
            vector[vector.length - i - 1] = buf;
       }
        return vector;
    }
    //O(n^2)
    public static double[] doBubbleSort(double[] vector) {
        boolean isSorted = false;
        double buf;
        while (!(isSorted)) {
            isSorted = true;
            for (int i = 0; i < vector.length; i++) {
                for (int j = 1; j < vector.length - i; j++) {
                    if (vector[j - 1] > vector[j]) {
                        isSorted = false;
                        buf = vector[j - 1];
                        vector[j - 1] = vector[j];
                        vector[j] = buf;
//                    without using additional memory
//                    vector[j] = vector[j] + vector[j + 1];
//                    vector[j + 1] = vector[j] - vector[j + 1];
//                    vector[j] = vector[j] - vector[j + 1];
                    }
                }
            }
        }
        return vector;
    }
    //O(n^2)
    public static double[] doInsertionSort(double[] vector) {
        double buf;
        for (int i = 1; i < vector.length; i++) {
            for (int j = i; j > 0; j--) {
                if (vector[j] < vector[j - 1]) {
                    buf = vector[j];
                    vector[j] = vector[j - 1];
                    vector[j - 1] = buf;
                }
            }
        }
        return vector;
    }

    //O(n^2)
    public static double[] doSelectionSort(double[] vector) {

        for (int i = 0; i < vector.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < vector.length; j++)
                if (vector[j] < vector[index])
                    index = j;

            double smallerNumber = vector[index];
            vector[index] = vector[i];
            vector[i] = smallerNumber;
        }
        return vector;
    }


}

