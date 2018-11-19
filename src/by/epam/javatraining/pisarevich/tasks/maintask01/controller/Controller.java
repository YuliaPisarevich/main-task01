package by.epam.javatraining.pisarevich.tasks.maintask01.controller;

import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.DoubleVector;
import by.epam.javatraining.pisarevich.tasks.maintask01.model.exceptions.VectorException;
import by.epam.javatraining.pisarevich.tasks.maintask01.model.logic.Calculation;
import by.epam.javatraining.pisarevich.tasks.maintask01.model.logic.Sorter;
import by.epam.javatraining.pisarevich.tasks.maintask01.util.VectorCreator;
import by.epam.javatraining.pisarevich.tasks.maintask01.util.VectorInitializer;
import by.epam.javatraining.pisarevich.tasks.maintask01.view.Print;

import static by.epam.javatraining.pisarevich.tasks.maintask01.controller.ValueToString.*;

import org.apache.log4j.Logger;

import static by.epam.javatraining.pisarevich.tasks.maintask01.model.logic.Searcher.*;
import static java.lang.Double.NaN;

/**
 * This program performs the following tasks
 * - find the extreme values (minimum and maximum elements) of a given vector;
 * - find the arithmetic average
 * - find geometric average of all elements of the vector;
 * - check whether all elements of the vector are in an order form
 *
 * - find the position of the first local minimum
 * - find the position of the first local maximum
 * if there are no such elements, then return -1;
 *
 * - linear search algorithm
 * - binary search algorithm
 * - reverse all elements of the vector;
 * - implement  algorithms for sorting vector elements.
 *
 * @author Pisarevich Yulia
 */


public class Controller {
    private static final double SEARCH_VALUE = 13.0;

    public static final Logger LOG = Logger.getRootLogger();

    public static void main(String[] args) {

        DoubleVector vector = VectorCreator.create();

        try {
            VectorInitializer.rndInput(vector, -10, 10);
            LOG.info("Vector initialization was successful");
            Print.print("Source vector " + toStringValue(vector));
        } catch (NegativeArraySizeException e) {
            LOG.info("NegativeArraySizeException");
        }

        try {
            double min = Calculation.findMinValue(vector);
            Print.print("Min value " + min);
            LOG.info("Min value was found and printed successful");
        } catch (VectorException e) {
            LOG.info("Couldn't find min value. ");
        }

        try {
            double arithmeticAverage = Calculation.findArithmeticAverage(vector);
            Print.print("ArithmeticAverage " + toStringValue(arithmeticAverage));
            LOG.info("ArithmeticAverage value was found and printed successful");
        } catch (VectorException e) {
            LOG.info("Couldn't find ArithmeticAverage ");
        }

        try {
            double geometricAverage = Calculation.findGeometricAverage(vector);
            if(geometricAverage == NaN){
                Print.print("GeometricAverage for positive numbers only. Can't find result" );
                LOG.info("Geometric average mean for positive numbers only. Result = NaN");
            }else {
                Print.print("GeometricAverage " + toStringValue(geometricAverage));
                LOG.info("GeometricAverage value was found and printed successful");
            }

        } catch (VectorException e) {
            LOG.info("Couldn't find geometric average. " +
                    "Geometric average mean for positive numbers only.");
        }


        try {
            double localMin = Calculation.findLocalMin(vector);
            Print.print("LocalMin " + localMin);
            LOG.info("LocalMin value was found and printed successful");
        } catch (VectorException e) {
            LOG.info("Couldn't find localMin /");
        }
        try {
            double localMax = Calculation.findLocalMax(vector);
            Print.print("LocalMax " + localMax);
            LOG.info("LocalMax value was found and printed successful");
        } catch (VectorException e) {
            LOG.info("Couldn't find localMax .");
        }
        try {
            Calculation.doReverse(vector);
            Print.print("Reverse vector" + toStringValue(vector));
            LOG.info("Reverse vector was found and printed successful");
        } catch (VectorException e) {
            LOG.info("Couldn't reverse vector. ");
        }

        try {
            double binarySearch = doBinarySearch(vector, SEARCH_VALUE);
            Print.print("BinarySearch result: " + binarySearch);
            LOG.info("BinarySearch value was performed and result printed successful");
        } catch (VectorException e) {
            LOG.info("Couldn't do BinarySearch. ");
        }

        try {
            boolean checkSort = Sorter.isSorted(vector);
            Print.print("Sort check result: " + checkSort);
            LOG.info("Sort check was performed and result printed successful");
        } catch (VectorException e) {
            LOG.info("Couldn't do checkSort. ");
        }
        try {
            DoubleVector selectionSort = Sorter.doSelectionSort(vector);
            Print.print("SelectionSort result: " + toStringValue(selectionSort));
            LOG.info("SelectionSort was performed and result printed successful");
        } catch (VectorException e) {
            LOG.info("Couldn't do SelectionSort. ");
        }


    }
}
