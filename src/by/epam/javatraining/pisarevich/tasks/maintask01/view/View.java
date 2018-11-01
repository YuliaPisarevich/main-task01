package by.epam.javatraining.pisarevich.tasks.maintask01.view;

import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.Data;

public class View {
    public void showData(Data data) {
        for(double t: data.getArray()) {
            System.out.println(" " + t);
        }
        System.out.println("Random generated vector\n");
    }
    public void showAvailableCommands(){

        System.out.println("1\tfind min value\n" +
                "2\tfind max value\n" +
                "3\tfind arithmetic average\n" +
                "4\tfind geometric average\n" +
                "5\task is sorted\n" +
                "6\tfind local min value\n" +
                "7\tfind local max value\n" +
                "8\tfind element by linear search\n" +
                "9\tfind element by binary search\n" +
                "10\treverse vector\n" +
                "11\tbubble sort\n" +
                "12\tinsertion sort\n" +
                "13\tselection sort");
    }

    public void showResult(String result){
        System.out.println(result);
    }
}
