package Serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IConjugaison extends Remote
{
    String conjuguePresent(String verbe) throws RemoteException;

    String conjuguePasseCompose(String verbe) throws RemoteException;

    String conjugueFutur(String verbe) throws RemoteException;

    boolean testConnexion() throws RemoteException;
}
