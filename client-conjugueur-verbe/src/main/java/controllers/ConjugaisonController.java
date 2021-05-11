package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class ConjugaisonController {
     ObservableList<String> list = FXCollections.observableArrayList("Présent", "Futur", "Passé composé");



//    private Verbe verbe;
//    private Temps tempsC;
//
//    ConjugaisonController(Verbe verbe, Temps tempsC){
//        this.verbe = verbe;
//        this.tempsC = tempsC;
//    }

    @FXML
    private Label adresseIp;

    @FXML
    private TextField infinitif;

    @FXML
    private ComboBox temps;

    @FXML
    private TextArea resultat;

    @FXML
    private Button btnRequete;


    @FXML
    void SendRequest() throws IOException {
        try {
            conjugaisonRequest();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void initialize() throws IOException {
        temps.setItems(list);
        temps.setValue("Choix d'un temps");
    }

//    @FXML
//    void Select() throws IOException {
//        this.temps = (Temps) temps.getSelectionModel().getSelectedItem();
//    }

    private void conjugaisonRequest() throws IOException {

    }

}