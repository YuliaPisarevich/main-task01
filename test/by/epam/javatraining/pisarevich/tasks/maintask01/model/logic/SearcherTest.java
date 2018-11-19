package by.epam.javatraining.pisarevich.tasks.maintask01.model.logic;

import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.DoubleVector;
import org.junit.Before;
import org.junit.Test;

import static by.epam.javatraining.pisarevich.tasks.maintask01.model.logic.Searcher.*;
import static org.junit.Assert.*;

public class SearcherTest {
    private DoubleVector vector;
    @Before
    public void init(){
        vector = new DoubleVector();
    }
    @Test
    public void linearSearchTest() {
        double[] a = {-5, 6, 55, 30};
        vector.setArray(a);
        double search = 55.0;
        int result = 2;
        assertEquals(result, doLinearSearch(vector, search));

    }

    @Test
    public void binarySearchTest() {
        double[] a = {-5, 6, 30, 55};
        vector.setArray(a);
        double search = 55.0;
        int result = 3;
        assertEquals(result, doBinarySearch(vector, search));
    }
}
