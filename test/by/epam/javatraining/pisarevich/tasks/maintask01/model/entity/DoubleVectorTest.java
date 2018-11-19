package by.epam.javatraining.pisarevich.tasks.maintask01.model.entity;

import by.epam.javatraining.pisarevich.tasks.maintask01.model.exceptions.logicexceptions.arrayindexoutofboundsexceptions.NegativeVectorSizeException;
import org.junit.Test;

import static by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.DoubleVector.DEFAULT_SIZE;
import static org.junit.Assert.*;

public class DoubleVectorTest {


    @Test
    public void defaultConstructorTest() {
        DoubleVector doubleVector = new DoubleVector();
        int expected = DEFAULT_SIZE;
        assertEquals(expected, doubleVector.getArray().length);
    }

    @Test
    public void CopyConstructorTest() {
        double[] input = {3, 5.0, 6};
        DoubleVector doubleVector1 = new DoubleVector(input);
        DoubleVector doubleVector2 = new DoubleVector(doubleVector1);
        assertArrayEquals(doubleVector1.getArray(), doubleVector2.getArray(), 0);
    }
    @Test
    public void ConstructorTest() {
        double[] input = {3, 5.0, 6};
        DoubleVector doubleVector = new DoubleVector(input);
        int expected = input.length;
        assertEquals(expected, doubleVector.getArray().length);
    }

    /**
     *
     *
     *
     *
     *
     *
     *
     */
    @Test(expected = NegativeArraySizeException.class)
    public void ConstructorWithSizeTest() {
        DoubleVector doubleVector = new DoubleVector(-5);
    }

    @Test
    public void getArrayTest() {
        double[] input = {3, 5.0, 6};
        DoubleVector doubleVector = new DoubleVector(input);
        assertArrayEquals(input, doubleVector.getArray(), 0);
    }
    @Test
    public void setArrayTest() {
        DoubleVector doubleVector = new DoubleVector();
        double[] input = {3, 5.0, 6};
        doubleVector.setArray(input);
        assertArrayEquals(input, doubleVector.getArray(), 0);
    }
}
