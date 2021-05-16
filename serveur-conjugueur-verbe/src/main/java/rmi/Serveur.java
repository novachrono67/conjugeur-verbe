package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Serveur
{
    public static int PORT_SERVEUR = 1249;
    public static String ENDPOINT_SERVEUR = "conjugaison";

    /**
     * Méthode main permettant de lancer le serveur RMI Conjugaison
     *
     * @param args
     */
    public static void main(String args[])
    {
        try {
            Registry registry = LocateRegistry.createRegistry(PORT_SERVEUR);
            System.out.println("RMI Registry: " + registry.toString() + "\n");
            Conjugaison conjugaison = new Conjugaison();
            Naming.rebind("rmi://localhost:" + PORT_SERVEUR + "/" + ENDPOINT_SERVEUR, conjugaison);
            System.out.println("Serveur Conjugaison Prêt \n");
        } catch (RemoteException | MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }
}
