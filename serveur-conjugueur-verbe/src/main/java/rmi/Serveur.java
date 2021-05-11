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

    public static void main(String args[])
    {
        try
        {

            Conjugaison conjugaison = new Conjugaison();
            Registry registry = LocateRegistry.createRegistry(PORT_SERVEUR);
            System.out.println(registry.toString());
            Naming.rebind("rmi://localhost:" + PORT_SERVEUR + "/" + ENDPOINT_SERVEUR, conjugaison);
            System.out.println ("Serveur Conjugaison Prêt");
        }
        catch (RemoteException e)
        {
            System.out.println(e.getMessage());
        }
        catch (MalformedURLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
