package main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private String myData = "";

    public void setMyData(String myData) {
        this.myData = myData;
        System.out.println("(MainController) Data received: " + this.myData);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}