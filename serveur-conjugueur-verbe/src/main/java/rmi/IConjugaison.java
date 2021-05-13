package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface de la classe RMI Conjugaison
 */
public interface IConjugaison extends Remote
{
    /**
     * Crée un string contenant la conjuguaison au temps spécifié, des 3 personnes du singulier et du pluriel
     * Si aucune conjugaison n'est trouvée pour le verbe, la méthode revoie un message d'erreur
     * Si le temps n'est pas reconnu, la méthode renvoie un message d'erreur
     *
     * @param verbe L'infinitif du verbe à conjuguer
     * @param temps Le temps auquel on souhaite conjuguer le verbe
     * @return String
     * @throws RemoteException
     */
    String conjugueTemps(String verbe, String temps) throws RemoteException;

    /**
     * Méthode simple permettant de tester la connexion au serveur RMI
     * Si la connexion au serveur n'abouti pas, un exception est lancée
     *
     * @return Renvoie true si la connexion au serveur RMI est réussie
     * @throws RemoteException
     */
    boolean testConnexion() throws RemoteException;
}
