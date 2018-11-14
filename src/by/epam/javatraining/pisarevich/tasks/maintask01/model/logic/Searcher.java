package by.epam.javatraining.pisarevich.tasks.maintask01.model.logic;

import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.DoubleVector;

public class Searcher {

    //O(n)
    public static int doLinearSearch(DoubleVector vector, double searchValue) {
        for (int i = 0; i < vector.getArray().length; i++) {
            if (searchValue == vector.getArray()[i]) {
                return i;
            }
        }
        return -1;
    }

    //O(log(n))
    public static int doBinarySearch(DoubleVector vector, double searchValue) {
        int low = 0;
        int high = vector.getArray().length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (searchValue == vector.getArray()[mid]) {
                return mid;
            } else if (searchValue > vector.getArray()[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
