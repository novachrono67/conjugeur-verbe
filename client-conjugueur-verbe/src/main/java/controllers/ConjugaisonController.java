package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import rmi.IConjugaison;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.AccessException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

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


    public void initialize() throws IOException
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
        } catch (NotBoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (AccessException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (RemoteException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (MalformedURLException e) {
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

        try {
            LocateRegistry.getRegistry(1249);
            IConjugaison obj = (IConjugaison) Naming.lookup("rmi://" +
                    ConnexionController.getAdresseServeur() + ":" +
                    ConnexionController.getPortServeur() + "/" + "conjugaison");

            String tempsChoisis = temps.getValue().toString();
            if (tempsChoisis.equalsIgnoreCase("Présent")) {
                conjugaison = obj.conjuguePresent(infinitif.getText().trim());
            } else if (tempsChoisis.equalsIgnoreCase("Futur")) {
                conjugaison = obj.conjugueFutur(infinitif.getText().trim());
            } else if (tempsChoisis.equalsIgnoreCase("Passé composé")) {
                conjugaison = obj.conjuguePasseCompose(infinitif.getText().trim());
            } else {
                //Popup window
            }
            resultat.setText(conjugaison);
        } catch (NotBoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (AccessException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (RemoteException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

}