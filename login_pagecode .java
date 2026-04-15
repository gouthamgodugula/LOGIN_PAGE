import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginPage extends Application {

    @Override
    public void start(Stage stage) {
        Label title = new Label("Login Page");
        Label message = new Label();
        TextField usernameField = new TextField();
        usernameField.setPromptText("Enter Username");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter Password");
        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            if (username.equals("admin") && password.equals("1234")) {
                message.setText("Login Successful!");
            } else {
                message.setText("Invalid Username or Password");
            }
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(title, usernameField, passwordField, loginButton, message);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 300, 250);
        stage.setTitle("Simple Login");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
