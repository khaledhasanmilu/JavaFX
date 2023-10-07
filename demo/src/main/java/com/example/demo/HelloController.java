package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    protected TextField textField;
    @FXML
    protected Label label;
    @FXML
    protected PasswordField passwordField;
    @FXML
    public Button button;
    @FXML
    public void LogIn(){
        String userName;
        String password;
        userName = textField.getText();
        password= passwordField.getText();
        if(userName.equals("khalid")||userName.equals("nurul")){
            if (password.equals("khaled104")){
                label.setText("Log In Successfully!");
            }
            else {
                label.setText("Invalid Password or User Name");
            }

        }
        else {
            label.setText("Invalid Password or User Name");
        }
    }


}