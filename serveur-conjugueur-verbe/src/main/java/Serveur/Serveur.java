package Serveur;

import Expert.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Serveur
{
    public static int PORT_SERVEUR = 1249;
    public static String ENDPOINT_SERVEUR = "conjugaison";

    public static void main(String args[])
    {
        try
        {
            Conjugaison conjugaison = new Conjugaison();
            LocateRegistry.createRegistry(PORT_SERVEUR);
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
