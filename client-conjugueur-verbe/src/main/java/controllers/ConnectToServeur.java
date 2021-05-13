package controllers;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class ConnectToServeur {
    private static String adresse = "localhost";
    private static String port = "1249";

    public static void main(String[] args) throws RemoteException {
        try{
            IConjugaison conjugaisonInterface = (IConjugaison) Naming.lookup("rmi://"+ adresse +":"+ port +"/conjugaison");
            conjugaisonInterface.testConnexion();
            conjugaisonInterface.conjuguePresent("marcher");
        }
        catch (Exception e)
        {
            System.out.println ("conjugaison exception: " + e);
        }
    }

}
