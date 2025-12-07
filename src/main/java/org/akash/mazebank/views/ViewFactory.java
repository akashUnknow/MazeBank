package org.akash.mazebank.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.akash.mazebank.Controller.Client.ClientController;

import java.io.IOException;

public class ViewFactory {
    //client views
    private AnchorPane dashboardView;
    public  ViewFactory(){}
    public AnchorPane getDashboardView(){
        if(dashboardView == null){
            try {
                dashboardView = new FXMLLoader(getClass().getResource("/Fxml/client/Dashboard.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return dashboardView;
    }
    public void showLoginWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        Scene scene=null;
        try {
            scene=new Scene(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage=new Stage();
        stage.setTitle("Login - Maze Bank");
        stage.setScene(scene);
        stage.show();
    }
    public void showClientWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/client/Client.fxml"));
        ClientController controller=new ClientController();
        loader.setController(controller);
        Scene scene=null;
        try {
            scene=new Scene(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage=new Stage();
        stage.setTitle("Maze Bank");
        stage.setScene(scene);
        stage.show();
    }
    public void CloseStage(Stage stage){
        stage.close();
    }
}
