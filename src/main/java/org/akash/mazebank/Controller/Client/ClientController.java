package org.akash.mazebank.Controller.Client;

import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import org.akash.mazebank.models.Model;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {
    public BorderPane client_parent;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getClientSlectedmenuIteam().addListener((observable, oldValue, newValue) -> {;
            switch (newValue){
                case "Dashboard"-> client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
                case "Transaction"-> client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionView());
            }
        });
    }
}
