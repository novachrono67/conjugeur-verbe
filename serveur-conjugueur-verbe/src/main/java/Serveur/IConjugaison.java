package Serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IConjugaison extends Remote
{
    String conjuguerPresent(String verbe) throws RemoteException;

    String conjuguerPasse(String verbe) throws RemoteException;

    String conjuguerFutur(String verbe) throws RemoteException;
}
