module lab.javafx.login {
    requires javafx.controls;
    requires javafx.fxml;


    opens lab.javafx.login to javafx.fxml;
    exports lab.javafx.login;
}