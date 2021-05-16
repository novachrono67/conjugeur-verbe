package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Scene;
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
    private String adresseIP;
    private String port;

    private ObservableList<String> list = FXCollections.observableArrayList("Présent", "Futur", "Passé composé", "Imparfait");

    @FXML
    private Label estConnecte;

    @FXML
    private TextField infinitif;

    @FXML
    private ComboBox temps;

    @FXML
    private CheckBox subjonctif;

    @FXML
    private Label labelError;

    @FXML
    private TextArea resultat;

    @FXML
    private Button btnRequete;

    private Scene scene;

    public ConjugaisonController(String adresseIP, String port)
    {
        this.adresseIP = adresseIP;
        this.port = port;
    }

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

    private boolean testConnexionServeur()
    {
        boolean testConnexion = false;
        try {
            LocateRegistry.getRegistry(adresseIP);
            IConjugaison obj = (IConjugaison) Naming.lookup("rmi://" + adresseIP + ":" + port + "/" + "conjugaison");
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

        return testConnexion;
    }

    private void conjugaisonRequest()
    {
        String conjugaison = "";
        String verbeChoisis = infinitif.getText().trim();
        String tempsChoisis = temps.getValue().toString().trim();
        boolean modeSubjonctif = subjonctif.isSelected();

        if(testConnexionServeur()) {
            try {
                LocateRegistry.getRegistry(adresseIP);
                IConjugaison obj = (IConjugaison) Naming.lookup("rmi://" + adresseIP + ":" + port + "/" + "conjugaison");
                conjugaison = obj.conjugueTemps(verbeChoisis, tempsChoisis, modeSubjonctif);
                if (conjugaison.startsWith("ERREUR")) {
                    labelError.setVisible(true);
                    labelError.setText(conjugaison);
                    resultat.clear();
                } else {
                    labelError.setVisible(false);
                    resultat.setText(conjugaison);
                }
            } catch (NotBoundException | RemoteException | MalformedURLException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }
}