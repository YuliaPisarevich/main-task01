package by.epam.javatraining.pisarevich.tasks.maintask01.model.logic;


import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.DoubleVector;
import org.junit.Test;

import static by.epam.javatraining.pisarevich.tasks.maintask01.model.logic.Sorter.*;
import static org.junit.Assert.*;

public class SorterTest {
    @Test
    public void isSortedTest() {
        DoubleVector vector = new DoubleVector();
        double[] a = {-5, 6, 25, 30};
        vector.setArray(a);
        boolean result = true;
        assertEquals(result, isSorted(vector));
    }

    @Test
    public void doBubbleSortTest() {
        DoubleVector vector = new DoubleVector();
        double[] a = {-5, 6, 31, 55, 30};
        vector.setArray(a);
        double[] result = {-5, 6, 30, 31, 55};
        assertArrayEquals(result, doBubbleSort(vector),0);
    }
    @Test
    public void doInsertionSortTest() {
        DoubleVector vector = new DoubleVector();
        double[] a = {-5, 6, 31, 55, 30};
        vector.setArray(a);
        double[] result = {-5, 6, 30, 31, 55};
        assertArrayEquals(result, doInsertionSort(vector),0);
    }
    @Test
    public void doSelectionSortTest() {
        DoubleVector vector = new DoubleVector();
        double[] a = {-5, 6, 31, 55, 30};
        vector.setArray(a);
        double[] result = {-5, 6, 30, 31, 55};
        assertArrayEquals(result, doSelectionSort(vector),0);
    }
    @Test
    public void doQuickSortTest() {
        DoubleVector vector = new DoubleVector();
        double[] a = {-5, 6, 31, 55, 30};
        vector.setArray(a);
        double[] result = {-5, 6, 30, 31, 55};
        assertArrayEquals(result, doQuickSort(vector),0);
    }

}
