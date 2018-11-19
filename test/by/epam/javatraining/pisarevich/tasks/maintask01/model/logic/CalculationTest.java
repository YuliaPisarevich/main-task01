package by.epam.javatraining.pisarevich.tasks.maintask01.model.logic;
import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.DoubleVector;
import static by.epam.javatraining.pisarevich.tasks.maintask01.model.logic.Calculation.*;

import by.epam.javatraining.pisarevich.tasks.maintask01.model.exceptions.logicexceptions.arithmeticexception.GeometricAverageVectorException;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Double.NaN;
import static org.junit.Assert.*;

public class CalculationTest {

	private DoubleVector vector;

    @Before
    public void init(){
	    vector = new DoubleVector();
    }

    @Test//(expected = nullPointerException.class)
    public  void findMinValueTest() {
        double[] a = {-5, 6, 55, 30};
        vector.setArray(a);
        double result = -5.0;
        assertEquals(result, findMinValue(vector),0);
    }
    @Test
    public void findMaxValueTest() {
        double[] a = {-5, 6, 55, 30};
        vector.setArray(a);
        double result = 55.0;
        assertEquals(result,findMaxValue(vector),0);
    }

    @Test
    public void findArithmeticAverageTest() {
        double[] a = {-5, 6, 55, 30};
        vector.setArray(a);
        double result = 21.5;
        assertEquals(result, findArithmeticAverage(vector), 0.0001);
    }

    /**
     * WTF
     */
    @Test //not done
    public void findGeometricAverageTest() {
        double[] a = {5, 5, 5, 5, 5};
        vector.setArray(a);
        double result = 5.0;
        assertEquals(result, findGeometricAverage(vector), 0.001);
    }
    @Test
    public void findGeometricAverageTestRootOfNegative() {
        double[] a = {-5, 1, 55, 30};
        vector.setArray(a);
        double result = NaN;
        assertEquals(result, findGeometricAverage(vector), 0.001);
    }
    @Test
    public void findGeometricAverageTestWithZero() {
        double[] a = {5, 0, 55, 30};
        vector.setArray(a);
        double result = 0;
        assertEquals(result, findGeometricAverage(vector), 0.001);
    }

    @Test
    public void findLocalMinTest() {
        double[] a = {-5, 6, 55, 30};
        vector.setArray(a);
        double result = -5.0;
        assertEquals(result, findLocalMin(vector), 0);
    }

    @Test
    public void findLocalMaxTest() {
        double[] a = {-5, 6, 55, 30};
        vector.setArray(a);
        double result = 55.0;
        assertEquals(result, findLocalMax(vector), 0);
    }
    @Test
    public void doReverseTest() {
        double[] a = {-5, 6, 55, 30};
        vector.setArray(a);
        doReverse(vector);
        double[] expected = {30, 55, 6, -5};
        double[] actual = vector.getArray();
        assertArrayEquals(expected, actual,0);
    }

}
