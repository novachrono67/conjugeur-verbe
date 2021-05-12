package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface de la classe RMI Conjugaison
 */
public interface IConjugaison extends Remote
{
    /**
     * Crée un string contenant la conjuguaison au présent simple des 3 personnes du singulier et du pluriel
     * Si aucune conjugaison n'est trouvée, la méthode revoie un message d'erreur
     *
     * @param verbe L'infinitif du verbe à conjuguer
     * @return String
     * @throws RemoteException
     */
    String conjuguePresent(String verbe) throws RemoteException;

    /**
     * Crée un string contenant la conjuguaison au futur simlpe des 3 personnes du singulier et du pluriel
     * Si aucune conjugaison n'est trouvée, la méthode revoie un message d'erreur
     *
     * @param verbe L'infinitif du verbe à conjuguer
     * @throws RemoteException
     */
    String conjuguePasseCompose(String verbe) throws RemoteException;

    /**
     * Crée un string contenant la conjuguaison au futur simlpe des 3 personnes du singulier et du pluriel
     * Si aucune conjugaison n'est trouvée, la méthode revoie un message d'erreur
     *
     * @param verbe L'infinitif du verbe à conjuguer
     * @throws RemoteException
     */
    String conjugueFutur(String verbe) throws RemoteException;

    /**
     * Méthode simple permettant de tester la connexion au serveur RMI
     * Si la connexion au serveur n'abouti pas, un exception est lancée
     *
     * @return Renvoie true si la connexion au serveur RMI est réussie
     * @throws RemoteException
     */
    boolean testConnexion() throws RemoteException;
}
