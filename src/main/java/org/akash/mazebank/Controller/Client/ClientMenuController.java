package org.akash.mazebank.Controller.Client;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import org.akash.mazebank.models.Model;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientMenuController implements Initializable {
    public Button dashBoard_btn;
    public Button transaction_btn;
    public Button accounts_btn;
    public Button profile_btn;
    public Button logout_btn;
    public Button report_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();

    }
    private void addListeners(){
        dashBoard_btn.setOnAction(e->onDashboard());
        transaction_btn.setOnAction(e->onTransaction());
        accounts_btn.setOnAction(e->onAccounts());
    }

    private void onTransaction() {
        Model.getInstance().getViewFactory().getClientSlectedmenuIteam().set("Transaction");
    }

    private void onDashboard() {
        Model.getInstance().getViewFactory().getClientSlectedmenuIteam().set("Dashboard");
    }
    private void  onAccounts() {
        Model.getInstance().getViewFactory().getClientSlectedmenuIteam().set("Accounts");
    }
}
