//Yulia Pisarevich 01.11.2018
//We have a vector of a certain size. It is necessary to describe the operations on it.

package by.epam.javatraining.pisarevich.tasks.maintask01;

import by.epam.javatraining.pisarevich.tasks.maintask01.controller.Controller;
import by.epam.javatraining.pisarevich.tasks.maintask01.model.entity.Data;
import by.epam.javatraining.pisarevich.tasks.maintask01.view.View;

public class Application {
    public static void main(String[] args) {
        Data data = new Data();
        Controller controller = new Controller(data);
        View view = new View();
        controller.inputVector();

        //show source vector
        view.showData(data);

        //show list of available functions
        view.showAvailableCommands();

        //launch the selected function and record result
        String result = controller.doCommand();

        //show result
        view.showResult(result);
    }
}
