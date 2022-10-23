package java_fx.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import java_fx.core.Fabrique;
import java_fx.entities.Classe;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class ClasseController implements Initializable{
    @FXML
    TableView<Classe> tblvClasse=new TableView<>();
   
   
    @FXML
    TableColumn<Classe,Integer> tblcid=new TableColumn<>();
    
    @FXML
    TableColumn<Classe,String> tblclibelle=new TableColumn<>();


    @FXML
     TextField txtniveau,txtfiliere;

    // tableview ne prend pas d'objet de types listes===>mais de type ObservableList
    private  ObservableList obClasses=FXCollections.observableList(Fabrique.getService().selectAllClasses());

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       tblcid.setCellValueFactory(new PropertyValueFactory<>("id"));
       tblclibelle.setCellValueFactory(new PropertyValueFactory<>("libelle"));

       tblvClasse.setItems(obClasses);
        
    }


    public void buttonCreerClasse(){
        String niveau=txtniveau.getText().trim();
        String filiere=txtfiliere.getText().trim();
        Classe classe = Fabrique.getService().insertClasse(new Classe(niveau,filiere));
        
        
        Alert alert=new Alert(AlertType.INFORMATION);
        alert.setTitle("Gestion ISM(inscription)");
        alert.setContentText("Une classe a ete cree avec succes");
        alert.show();
        obClasses.add(classe);
        txtniveau.clear();
        txtfiliere.clear();

    }
    
}
