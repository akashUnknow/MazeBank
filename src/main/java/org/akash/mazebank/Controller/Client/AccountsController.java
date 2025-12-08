package org.akash.mazebank.Controller.Client;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountsController implements Initializable {
    public Text ch_acc_num;
    public Text transaction_limit;
    public Text ch_account_date;
    public Text ch_account_bal;
    public Text saving_acc_num;
    public Text withdrawal_limit;
    public Text sv_acc_date;
    public Text sv_acc_bal;
    public TextField amount_to_sv;
    public Button trans_to_sv_btn;
    public TextField amount_to_ch;
    public Button trans_to_ch_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
