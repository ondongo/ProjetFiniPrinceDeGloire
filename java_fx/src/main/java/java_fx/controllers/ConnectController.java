package java_fx.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import java_fx.App;
import java_fx.core.Fabrique;
import java_fx.entities.UsersAdmin;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;




public class ConnectController implements Initializable{



    @FXML
    Text lblError;

    @FXML
    TextField txtlogin;
    
    @FXML
    PasswordField txtpassword;

    public  static  UsersAdmin user;




    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblError.setVisible(false);
    }

    public void boutonConnexion() throws IOException{
        String login =txtlogin.getText().trim(); 
        String password =txtpassword.getText().trim();
        // lblError.setVisible(true);
       user=Fabrique.getService().connexion(login, password);

        if(user==null){
            lblError.setVisible(true);  
        }else{
            lblError.setVisible(false);
            App.setRoot("home");

        
        }

    }
}