package by.epam.javatraining.pisarevich.tasks.maintask01.controller;

import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.DoubleVector;
import by.epam.javatraining.pisarevich.tasks.maintask01.model.exceptions.EmptyVectorException;
import by.epam.javatraining.pisarevich.tasks.maintask01.model.exceptions.NullVectorException;
import by.epam.javatraining.pisarevich.tasks.maintask01.model.logic.Calculation;
import by.epam.javatraining.pisarevich.tasks.maintask01.model.logic.Searcher;
import by.epam.javatraining.pisarevich.tasks.maintask01.model.logic.Sorter;
import by.epam.javatraining.pisarevich.tasks.maintask01.util.VectorCreator;
import by.epam.javatraining.pisarevich.tasks.maintask01.util.VectorInitializer;
import by.epam.javatraining.pisarevich.tasks.maintask01.view.Print;
import org.apache.log4j.Logger;
/**
 * This program performs the following tasks
 * - find the extreme values (minimum and maximum elements) of a given vector;
 * - find the arithmetic average
 * - find geometric average of all elements of the vector;
 * - check whether all elements of the vector are in an order form
 *
 * - find the position of the first local minimum
 * - find the position of the first local maximum
 *      if there are no such elements, then return -1;
 *
 *  - linear search algorithm
 *  - binary search algorithm
 *  - reverse all elements of the vector;
 *  - implement  algorithms for sorting vector elements.
 *
 * @author Pisarevich Yulia
 *
 */
//not ready yet :(
//exceptions!!!

public  class Controller {
    private static final double  SEARCH_VALUE = 13.0;

    public static final Logger LOG = Logger.getRootLogger();

    public static void main(String[] args) {

    DoubleVector vector = VectorCreator.create();
    VectorInitializer.rndInput(vector, -10, 10);
    LOG.info("Vector initialization was successful");
    Print.print("Source vector", vector);


    double min = Calculation.findMinValue(vector);
    Print.print("Min value", min);
    LOG.info("Min value was found and printed successful");

    double arithmeticAverage = Calculation.findArithmeticAverage(vector);
    Print.print("ArithmeticAverage", arithmeticAverage);
    LOG.info("ArithmeticAverage value was found and printed successful");

    try {
        double geometricAverage = Calculation.findGeometricAverage(vector);
        Print.print("GeometricAverage", geometricAverage);
        LOG.info("GeometricAverage value was found and printed successful");
    }catch (ArithmeticException e){
        LOG.info("Couldn't find geometric average. " +
                "Geometric average mean for positive numbers only.");
        }

    double geometricAverage = Calculation.findGeometricAverage(vector);
    Print.print("GeometricAverage", geometricAverage);
    LOG.info("GeometricAverage value was found and printed successful");

    double localMin = Calculation.findLocalMin(vector);
    Print.print(localMin);
    LOG.info("LocalMin value was found and printed successful");

    double localMax = Calculation.findLocalMax(vector);
    Print.print("LocalMax", localMax);
    LOG.info("LocalMax value was found and printed successful");

    double[] reverse = Calculation.doReverse(vector);
    Print.print("Reverse vector", reverse);
    LOG.info("Reverse vector was found and printed successful");

    double binarySearch = Searcher.doBinarySearch(vector, SEARCH_VALUE);
    Print.print("BinarySearch result", binarySearch);
    LOG.info("BinarySearch value was performed and result printed successful");

    boolean checkSort = Sorter.isSorted(vector);
    Print.print("Sort check result", checkSort);
    LOG.info("Sort check was performed and result printed successful");

    double[] selectionSort = Sorter.doSelectionSort(vector);
    Print.print("SelectionSort result", selectionSort);
    LOG.info("SelectionSort was performed and result printed successful");

    }
}
