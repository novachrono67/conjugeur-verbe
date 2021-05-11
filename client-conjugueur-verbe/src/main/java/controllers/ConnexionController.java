package controllers;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.rmi.RemoteException;
import java.sql.SQLException;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ConnexionController {

    @FXML
    private TextField adresseIp;

    @FXML
    private TextField port;

    @FXML
    private Button btnConnexion;

    @FXML
    void UserConnexion() throws IOException {
        try {
            checkConnexion();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initialize() throws RemoteException {

    }


    private void checkConnexion() throws IOException {
        String adrIp = adresseIp.getText().toString();
        String port1 = port.getText().toString();

//        Boolean connect = false;
//        this.connexion = serveurSocket.toConnect(adresseIp.getText().toString(),port.getText().toString());
//        if(this.connexion != null){
//            connect = true;
//        }
        String test = System.getProperty("user.dir");
        URL url = (new File(test + "\\src\\main\\java\\vues\\Conjugaison.fxml").toURI().toURL());
        FXMLLoader fxmlLoader = new FXMLLoader(url);
        ConjugaisonController conjugaisonController;
        AnchorPane root = null;
        conjugaisonController = new ConjugaisonController();
        fxmlLoader.setController(conjugaisonController);
        try {
            root = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        Stage appStage = (Stage) btnConnexion.getScene().getWindow();
        appStage.setScene(scene);
        appStage.setTitle("Conjugaison");

    }


}