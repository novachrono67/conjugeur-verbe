package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.rmi.RemoteException;

/**
 * Classe contrôleur de la vue Connexion
 */
public class ConnexionController
{
    @FXML
    private TextField adresseIp;

    @FXML
    private TextField port;

    @FXML
    private Button btnConnexion;

    @FXML
    void UserConnexion() throws IOException
    {
        try {
            checkConnexion();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initialize() throws RemoteException
    {

    }

    private void checkConnexion() throws IOException
    {
        String adresseServeur = adresseIp.getText();
        String portServeur = port.getText();

        String test = System.getProperty("user.dir");
        URL url = (new File(test + "\\src\\main\\java\\vues\\Conjugaison.fxml").toURI().toURL());
        FXMLLoader fxmlLoader = new FXMLLoader(url);
        ConjugaisonController conjugaisonController;
        AnchorPane root = null;
        conjugaisonController = new ConjugaisonController(adresseServeur, portServeur);
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