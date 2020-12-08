package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import loginScreen.LoginController;
import loginScreen.LoginModel;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private TextField answer;
    @FXML
    private TextField question;

    private MainModel model = new MainModel();

    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public static void show(Stage stage)
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("main.fxml"));
            Parent root = fxmlLoader.load();

            Stage mainStage = new Stage();
            mainStage.setTitle("Main");
            mainStage.setScene(new Scene(root, 500, 500));
            mainStage.show();
        }
        catch(Exception ex)
        {
            System.out.println("Exception occured while loading main view!");
        }
    }

    @FXML
    public void answer()
    {
        answer.setText(model.specialanswers(question.getText()));
    }
}