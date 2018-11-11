package by.epam.javatraining.pisarevich.tasks.maintask01.controller;

import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.DoubleVector;
import by.epam.javatraining.pisarevich.tasks.maintask01.model.logic.Calculation;
import by.epam.javatraining.pisarevich.tasks.maintask01.util.VectorCreator;
import by.epam.javatraining.pisarevich.tasks.maintask01.util.VectorInitializer;
import by.epam.javatraining.pisarevich.tasks.maintask01.view.View;
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

public  class Controller {
    public static final Logger LOG = Logger.getRootLogger();
    public static void main(String[] args) {
    DoubleVector vector = VectorCreator.create();
    VectorInitializer.rndInput(vector, -10, 10);
    LOG.info("Vector initialization was successful");
    View.print(vector);

    double max = Calculation.findMaxValue(vector);
    View.print(max);
    LOG.info("Max value was found and printed successful");

    double[] reverse = Calculation.doReverse(vector);
    View.print(reverse);
    LOG.info("Reverse vector was found and printed successful");

    }
}
