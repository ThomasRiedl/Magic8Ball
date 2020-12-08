package loginScreen;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.MainController;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private void next()
    {
        //navigate from welcome screen to main screen
        System.out.println("Navigation started ...");

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main.fxml"));
            Parent root = fxmlLoader.load();

            //send data to MainController
            MainController ctrl = fxmlLoader.getController();
            ctrl.setMyData("Hello from Welcome Controller!");

            Stage mainStage = new Stage();
            mainStage.setTitle("Main");
            mainStage.setScene(new Scene(root, 500, 500));
            mainStage.show();

            this.stage.close();
        }
        catch(Exception ex)
        {
            System.out.println("Exception occured while loading main view!");
        }
    }
}