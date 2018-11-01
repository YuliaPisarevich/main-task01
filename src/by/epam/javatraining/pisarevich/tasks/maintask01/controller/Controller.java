package by.epam.javatraining.pisarevich.tasks.maintask01.controller;

import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.Data;

import static by.epam.javatraining.pisarevich.tasks.maintask01.model.logic.VectorLogic.*;

import java.util.Random;
import java.util.Scanner;

public class Controller {
    private Data data ;

    public Controller(Data data) {
        this.data = data;
    }
    //set random value of the source vector
    public void inputVector() throws NegativeArraySizeException {
        System.out.println("enter the length of the vector");
        Random random = new Random();
        int size = nextInt();
        double[] array = new double[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble()*20 - 10;
        }
        data.setArray(array);
    }

    private int nextInt() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }
    //the action of the selected command
    public String doCommand() {
        System.out.println("\n enter the number of command");
        int num = nextInt();
        String result ="";
        switch (num) {
            case 1: result = findMinValue(data.getArray()) +"";
                break;
            case 2: result = findMaxValue(data.getArray())+"";
                break;
            case 3: result = findArithmeticAverage(data.getArray())+"";
                break;
            case 4: result = findGeometricAverage(data.getArray())+"";
                break;
            case 5: result = isSorted(data.getArray())+"";
                break;
            case 6: result = findLocalMin(data.getArray())+"";
                break;
            case 7: result = findLocalMax(data.getArray())+"";
                break;
            case 8: System.out.println("enter search value");
                    Scanner inSearch1 = new Scanner(System.in);
                    double searchLinear = inSearch1.nextDouble();
                    result = linearSearch(data.getArray(),searchLinear)+"";
                    break;
            case 9: System.out.println("enter search value");
                    Scanner inSearch2 = new Scanner(System.in);
                    double searchBinary = inSearch2.nextDouble();
                    result = binarySearch(data.getArray(),searchBinary)+"";
                    break;
            case 10: for(double t: reverse(data.getArray())) {
                        result +="\n " + t;
                    }
                break;
            case 11: for(double t: doBubbleSort(data.getArray())) {
                        result +="\n " + t;
                    }
                break;
            case 12: for(double t: doInsertionSort(data.getArray())) {
                        result +="\n " + t;
                    }
                break;
            case 13: for(double t: doSelectionSort(data.getArray())) {
                    result +="\n " + t;
                    }
                break;


            default:
                result = 0 + "";
                System.out.println("You enter wrong command. The result is 0");
                break;
        }
        return result;
    }

}
