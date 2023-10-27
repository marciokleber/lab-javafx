package lab.javafx.login;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField user;
    @FXML
    private TextField pass;
    @FXML
    public Button submit;
    @FXML
    protected void onSubmitButtonClick() {
        System.out.println("User: " + user.getText() + "\nPass: " + pass.getText());
    }


    }
