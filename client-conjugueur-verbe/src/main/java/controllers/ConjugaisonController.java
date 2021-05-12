package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
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
    void SendRequest() throws IOException
    {
        try {
            conjugaisonRequest();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
            LocateRegistry.getRegistry(1249);
            IConjugaison obj = (IConjugaison) Naming.lookup("rmi://" + ConnexionController.adresseServeur + ":" + ConnexionController.portServeur + "/" + "conjugaison");
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
            estConnecte.setText("Connecté au serveur");
        } else {
            estConnecte.setText("Echec de connexion au serveur");
        }
    }

    private void conjugaisonRequest() throws IOException
    {
        try {
            LocateRegistry.getRegistry(1249);
            IConjugaison obj = (IConjugaison) Naming.lookup("rmi://" + ConnexionController.adresseServeur + ":" + ConnexionController.portServeur + "/" + "conjugaison");
            String conjugaisonPresent = obj.conjuguePresent(infinitif.getText().trim());
            resultat.setText(conjugaisonPresent);
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