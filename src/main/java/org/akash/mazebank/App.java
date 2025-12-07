package org.akash.mazebank;

import javafx.application.Application;
import javafx.stage.Stage;
import org.akash.mazebank.models.Model;


public class App extends Application {
    @Override
    public void start(Stage stage) {
        Model.getInstance().getViewFactory().showLoginWindow();

    }
}
