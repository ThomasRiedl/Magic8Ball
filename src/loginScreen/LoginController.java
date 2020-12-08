package loginScreen;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.MainController;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private TextField name;
    @FXML
    private TextField password;

    private LoginModel model = new LoginModel();

    private Stage stage;

    public void setStage(Stage stage)
    {
        this.stage = stage;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public static void show(Stage stage)
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(LoginController.class.getResource("login.fxml"));
            Parent root = fxmlLoader.load();

            //send data to MainController
            LoginController ctrl = fxmlLoader.getController();
            ctrl.setStage(stage);

            stage.setTitle("Login");
            stage.setScene(new Scene(root, 250, 300));
            stage.show();
        }
        catch(Exception ex)
        {
            System.out.println("Exception occured while loading main view!");
        }
    }

    private void next()
    {
        MainController.show(new Stage());
        stage.close();
    }

    public void login()
    {
        boolean trueorfalse = model.comparelogin(name.getText(), password.getText());

        if(trueorfalse)
        {
            next();
        }
        else
        {
            System.out.println("error");
        }
    }
}
