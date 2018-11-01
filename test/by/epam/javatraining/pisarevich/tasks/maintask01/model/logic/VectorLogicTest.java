package by.epam.javatraining.pisarevich.tasks.maintask01.model.logic;

import org.junit.Test;

import static by.epam.javatraining.pisarevich.tasks.maintask01.model.logic.VectorLogic.*;
import static org.junit.Assert.*;

public class VectorLogicTest {

    @Test
    public void findMinValueTest() {
        double[] a = {-5, 6, 55, 30};
        double result = -5.0;
        assertEquals(result, findMinValue(a),0.001);
    }
    @Test
    public void findMaxValueTest() {
        double[] a = {-5, 6, 55, 30};
        double result = 55.0;
        assertEquals(result, findMaxValue(a),0.001);
    }

    @Test
    public void findArithmeticAverageTest() {
        double[] a = {-5, 6, 55, 30};
        double result = 21.5;
        assertEquals(result, findArithmeticAverage(a), 0.1);
    }

    @Test //not done
    public void findGeometricAverageTest() {
        double[] a = {-5, 6, 55, 30};
        double result = -1.0;
        assertEquals(result, findGeometricAverage(a), 0.1);
    }

    @Test
    public void isSortedTest() {
        double[] a = {-5, 6, 25, 30};
        boolean result = true;
        assertEquals(result, isSorted(a));
    }

    @Test
    public void findLocalMinTest() {
        double[] a = {-5, 6, 55, 30};
        double result = -5.0;
        assertEquals(result, findLocalMin(a), 0.1);
    }

    @Test
    public void findLocalMaxTest() {
        double[] a = {-5, 6, 55, 30};
        double result = 55.0;
        assertEquals(result, findLocalMax(a), 0.1);
    }

    @Test
    public void linearSearchTest() {
        double[] a = {-5, 6, 55, 30};
        double search = 55.0;
        int result = 2;
        assertEquals(result, linearSearch(a,search));

    }

    @Test
    public void binarySearchTest() {
        double[] a = {-5, 6, 55, 30};
        double search = 55.0;
        int result = 2;
        assertEquals(result, binarySearch(a,search));
    }

    @Test
    public void reverseTest() {
        double[] a = {-5, 6, 55, 30, 31};
        double[] result = {31, 30, 55, 6, -5};
        assertArrayEquals(result, reverse(a),0.01);
    }

    @Test
    public void doBubbleSortTest() {
        double[] a = {-5, 6, 55, 30, 31};
        double[] result = {-5, 6, 30, 31, 55};
        assertArrayEquals(result, doBubbleSort(a),0.01);
    }
    @Test
    public void doInsertionSortTest() {
        double[] a = {-5, 6, 55, 30, 31};
        double[] result = {-5, 6, 30, 31, 55};
        assertArrayEquals(result, doInsertionSort(a),0.01);
    }
    @Test
    public void doSelectionSortTest() {
        double[] a = {-5, 6, 55, 30, 31};
        double[] result = {-5, 6, 30, 31, 55};
        assertArrayEquals(result, doSelectionSort(a),0.01);
    }

}
