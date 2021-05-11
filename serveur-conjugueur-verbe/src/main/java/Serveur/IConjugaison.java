package Serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IConjugaison extends Remote
{
    String conjuguePresent(String verbe) throws RemoteException;

    String conjuguerPasse(String verbe) throws RemoteException;

    String conjuguerFutur(String verbe) throws RemoteException;

    boolean testConnexion() throws RemoteException;
}
