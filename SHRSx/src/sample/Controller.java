package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Controller
{
    @FXML
    private Button  btn1,btn2,btn3 ;
    @FXML
    private TextField username, password;

    @FXML
    public void switchToSignUp() throws Exception{
        Parent signUp = FXMLLoader.load(getClass().getResource("signUp.fxml"));
        Stage window = (Stage) btn2.getScene().getWindow();
        window.setScene(new Scene(signUp,600,400));
    }
    @FXML
    public void returnToLogin() throws Exception{
        Parent scene = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage window = (Stage) btn3.getScene().getWindow();
        window.setScene(new Scene(scene,600,400));
    }
    @FXML
    public void loginToRecords() throws Exception{

        Parent scene = FXMLLoader.load(getClass().getResource("records.fxml"));
        Stage window = (Stage) btn1.getScene().getWindow();
        window.setScene(new Scene(scene,600,400));
    }
}
