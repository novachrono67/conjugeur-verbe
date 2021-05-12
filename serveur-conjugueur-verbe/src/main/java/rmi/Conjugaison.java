package rmi;

import expert.*;
import verbe.Verbe;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Classe RMI permettant de conjuguer un verbe (sous la forme d'un string) à un temps spécifique
 */
public class Conjugaison extends UnicastRemoteObject implements IConjugaison
{
    private ConjuguerVerbe conjuguerVerbe;

    /**
     * Constructeur créant la chain of responsibility
     *
     * @throws RemoteException
     */
    public Conjugaison() throws RemoteException
    {
        super();
        ConjuguerVerbeCOR conjuguerVerbe1erG = new ConjuguerVerbe1erGCOR(null);
        ConjuguerVerbeCOR conjuguerVerbe2emeG = new ConjuguerVerbe2emeGCOR(conjuguerVerbe1erG);
        ConjuguerVerbeCOR conjuguerVerbeAITRE = new ConjuguerVerbeAITRECOR(conjuguerVerbe2emeG);
        ConjuguerVerbeCOR conjuguerVerbeOUDRE = new ConjuguerVerbeOUDRECOR(conjuguerVerbeAITRE);
        ConjuguerVerbeCOR conjuguerVerbeETTRE = new ConjuguerVerbeETTRECOR(conjuguerVerbeOUDRE);
        ConjuguerVerbeCOR conjuguerVerbeINDRE = new ConjuguerVerbeINDRECOR(conjuguerVerbeETTRE);
        ConjuguerVerbeCOR conjuguerVerbeCER = new ConjuguerVerbeCERCOR(conjuguerVerbeINDRE);
        this.conjuguerVerbe = conjuguerVerbeCER;
    }

    /**
     * Crée un string contenant la conjuguaison au présent simple des 3 personnes du singulier et du pluriel
     * Si aucune conjugaison n'est trouvée, la méthode revoie un message d'erreur
     *
     * @param verbe L'infinitif du verbe à conjuguer
     * @return String
     */
    public String conjuguePresent(String verbe)
    {
        Verbe v = conjuguerVerbe.conjugue(verbe);
        if (v == null) {
            return getMessageErreur(verbe);
        }
        return v.conjuguePresent();
    }

    /**
     * Crée un string contenant la conjuguaison au futur simlpe des 3 personnes du singulier et du pluriel
     * Si aucune conjugaison n'est trouvée, la méthode revoie un message d'erreur
     *
     * @param verbe L'infinitif du verbe à conjuguer
     * @return String
     */
    public String conjugueFutur(String verbe)
    {
        Verbe v = conjuguerVerbe.conjugue(verbe);
        if (v == null) {
            return getMessageErreur(verbe);
        }
        return v.conjugueFutur();
    }

    /**
     * Crée un string contenant la conjuguaison au futur simlpe des 3 personnes du singulier et du pluriel
     * Si aucune conjugaison n'est trouvée, la méthode revoie un message d'erreur
     *
     * @param verbe L'infinitif du verbe à conjuguer
     * @return String
     */
    public String conjuguePasseCompose(String verbe)
    {
        Verbe v = conjuguerVerbe.conjugue(verbe);
        if (v == null) {
            return getMessageErreur(verbe);
        }
        return v.conjuguePasse();
    }

    /**
     * Méthode simple permettant de tester la connexion au serveur RMI
     * Si la connexion au serveur n'abouti pas, un exception est lancée
     *
     * @return Renvoie true si la connexion au serveur RMI est réussie
     */
    public boolean testConnexion()
    {
        return true;
    }

    /**
     * Le message d'erreur renvoyé lorsque la conjugaison d'un verbe est introuvable
     *
     * @param verbe L'infinitif du verbe
     * @return Message d'erreur
     */
    private String getMessageErreur(String verbe)
    {
        return "ERREUR - Aucune conjugaison n'a été trouvée pour le verbe \"" + verbe + "\"";
    }
}
