package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import loginScreen.LoginController;
import loginScreen.LoginModel;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private MainModel model = new MainModel();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public static void show(Stage stage)
    {
        //navigate from welcome screen to main screen
        System.out.println("Navigation started ...");

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(LoginController.class.getResource("login.fxml"));
            Parent root = fxmlLoader.load();

            //send data to MainController
            MainController ctrl = fxmlLoader.getController();
            ctrl.setStage(stage);

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
}