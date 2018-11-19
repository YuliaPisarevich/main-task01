package by.epam.javatraining.pisarevich.tasks.maintask01.model.entity;


public class DoubleVector {
    public static final int DEFAULT_SIZE = 10;
    private double[] array;

    //default constructor
    public DoubleVector() {
        this.array = new double[DEFAULT_SIZE];
    }

    //constructor with params
    public DoubleVector(double[] array) {
        this.array = array;
    }

    //constructor with size
    public DoubleVector(int size) {
        this.array = new double[size];
    }

    //copy constructor
    public DoubleVector(DoubleVector another) {
        this.array = another.getArray();
    }

    //getter
    public double[] getArray() {
        return array;
    }

    //setter
    public void setArray(double[] vector) {
        this.array = vector;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (double value : array) {
            builder.append(value).append("\n");
        }
        return builder + "";
    }


}
