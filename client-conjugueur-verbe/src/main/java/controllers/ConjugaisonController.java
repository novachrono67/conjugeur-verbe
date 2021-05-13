package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import rmi.IConjugaison;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Classe contrôleur de la vue Conjugaison
 */
public class ConjugaisonController
{
    private ObservableList<String> list = FXCollections.observableArrayList("Présent", "Futur", "Passé composé");

    @FXML
    private Label estConnecte;

    @FXML
    private TextField infinitif;

    @FXML
    private ComboBox temps;

    @FXML
    private TextArea resultat;

    @FXML
    private Button btnRequete;


    @FXML
    void SendRequest()
    {
        conjugaisonRequest();
    }


    public void initialize()
    {
        temps.setItems(list);
        temps.setValue("Choix d'un temps");

        testConnexionServeur();
    }

    private void testConnexionServeur()
    {
        boolean testConnexion = false;
        try {
            LocateRegistry.getRegistry(ConnexionController.getPortServeur());
            IConjugaison obj = (IConjugaison) Naming.lookup("rmi://" +
                    ConnexionController.getAdresseServeur() + ":" +
                    ConnexionController.getPortServeur() + "/" + "conjugaison");

            testConnexion = obj.testConnexion();
        } catch (NotBoundException | RemoteException | MalformedURLException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        if (testConnexion) {
            estConnecte.setText("Connexion Réussie");
            estConnecte.setTextFill(Color.GREEN);
        } else {
            estConnecte.setText("Connexion Échouée");
            estConnecte.setTextFill(Color.RED);
        }
    }

    private void conjugaisonRequest()
    {
        String conjugaison = "";
        String verbeChoisis = infinitif.getText().trim();
        String tempsChoisis = temps.getValue().toString().trim();

        try {
            LocateRegistry.getRegistry(ConnexionController.getPortServeur());
            IConjugaison obj = (IConjugaison) Naming.lookup("rmi://" +
                    ConnexionController.getAdresseServeur() + ":" +
                    ConnexionController.getPortServeur() + "/" + "conjugaison");

            conjugaison = obj.conjugueTemps(verbeChoisis, tempsChoisis);
            resultat.setText(conjugaison);
        } catch (NotBoundException | RemoteException | MalformedURLException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}