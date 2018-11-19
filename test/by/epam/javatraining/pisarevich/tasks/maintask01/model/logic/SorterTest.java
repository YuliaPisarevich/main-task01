package by.epam.javatraining.pisarevich.tasks.maintask01.model.logic;


import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.DoubleVector;
import org.junit.Before;
import org.junit.Test;

import static by.epam.javatraining.pisarevich.tasks.maintask01.model.logic.Sorter.*;
import static org.junit.Assert.*;

public class SorterTest {
    private DoubleVector vector;

    @Before
    public void init(){
        vector = new DoubleVector();
    }

    @Test
    public void isSortedTest() {
        double[] a = {-5, 6, 25, 30};
        vector.setArray(a);
        boolean result = true;
        assertEquals(result, isSorted(vector));
    }

    @Test
    public void doBubbleSortTest() {
        double[] a = {-5, 6, 31, 55, 30};
        vector.setArray(a);
        double[] result = {-5, 6, 30, 31, 55};
        assertArrayEquals(result, doBubbleSort(vector).getArray(),0);
    }
    @Test
    public void doInsertionSortTest() {
        double[] a = {-5, 6, 31, 55, 30};
        vector.setArray(a);
        double[] result = {-5, 6, 30, 31, 55};
        assertArrayEquals(result, doInsertionSort(vector).getArray(),0);
    }
    @Test
    public void doSelectionSortTest() {
        double[] a = {-5, 6, 31, 55, 30};
        vector.setArray(a);
        double[] result = {-5, 6, 30, 31, 55};
        assertArrayEquals(result, doSelectionSort(vector).getArray(),0);
    }
    @Test
    public void doQuickSortTest() {
        double[] a = {30, 6, 31, 55, -5};
        vector.setArray(a);
        double[] result = {-5, 6, 30, 31, 55};
        assertArrayEquals(result, doQuickSort(vector).getArray(),0);
    }
    @Test
    public void doMergeSortTest() {
        double[] a = {-5, 6, 31, 55, 30};
        vector.setArray(a);
        double[] result = {-5, 6, 30, 31, 55};
        assertArrayEquals(result, sortMergeSort(vector).getArray(),0);
    }

}
