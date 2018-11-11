package by.epam.javatraining.pisarevich.tasks.maintask01.model.logic;
import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.DoubleVector;
import static by.epam.javatraining.pisarevich.tasks.maintask01.model.logic.Calculation.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationTest {
    @Test
    public  void findMinValueTest() {
        DoubleVector vector = new DoubleVector();
        double[] a = {-5, 6, 55, 30};
        vector.setArray(a);
        double result = -5.0;
        assertEquals(result, findMinValue(vector),0);
    }
    @Test
    public void findMaxValueTest() {
        DoubleVector vector = new DoubleVector();
        double[] a = {-5, 6, 55, 30};
        vector.setArray(a);
        double result = 55.0;
        assertEquals(result,findMaxValue(vector),0);
    }

    @Test
    public void findArithmeticAverageTest() {
        DoubleVector vector = new DoubleVector();
        double[] a = {-5, 6, 55, 30};
        vector.setArray(a);
        double result = 21.5;
        assertEquals(result, findArithmeticAverage(vector), 0.0001);
    }

    @Test 
    public void findGeometricAverageTest() {
        DoubleVector vector = new DoubleVector();
        double[] a = {-5, 6, 55, 30};
        vector.setArray(a);
        double result = -1.0;
        assertEquals(result, findGeometricAverage(vector), 0.0001);
    }

    @Test
    public void findLocalMinTest() {
        DoubleVector vector = new DoubleVector();
        double[] a = {-5, 6, 55, 30};
        vector.setArray(a);
        double result = -5.0;
        assertEquals(result, findLocalMin(vector), 0);
    }

    @Test
    public void findLocalMaxTest() {
        DoubleVector vector = new DoubleVector();
        double[] a = {-5, 6, 55, 30};
        vector.setArray(a);
        double result = 55.0;
        assertEquals(result, findLocalMax(vector), 0);
    }
    @Test
    public void doReverseTest() {
        DoubleVector vector = new DoubleVector();
        double[] a = {-5, 6, 55, 30};
        vector.setArray(a);
        double[] result = {30, 55, 6, -5};
        assertArrayEquals(result, doReverse(vector),0);
    }

}
