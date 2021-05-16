package rmi;

import expert.temps.*;
import expert.verbe.*;
import temps.Temps;
import verbe.Verbe;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Classe RMI permettant de conjuguer un verbe (sous la forme d'un string) à un temps spécifique
 */
public class Conjugaison extends UnicastRemoteObject implements IConjugaison
{
    private ConjuguerVerbe conjuguerVerbe;
    private ConjuguerTemps conjuguerTemps;

    /**
     * Constructeur créant les "chain of responsibility"
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
        ConjuguerVerbeCOR conjuguerVerbeGER = new ConjuguerVerbeGERCOR(conjuguerVerbeCER);
        this.conjuguerVerbe = conjuguerVerbeGER;

        ConjuguerTempsCOR conjuguerTempsPresent = new ConjuguerTempsPresentCOR(null);
        ConjuguerTempsCOR conjuguerTempsFutur = new ConjuguerTempsFuturCOR(conjuguerTempsPresent);
        ConjuguerTempsCOR conjuguerTempsPasseCompose = new ConjuguerTempsPasseComposeCOR(conjuguerTempsFutur);
        this.conjuguerTemps = conjuguerTempsPasseCompose;
    }

    /**
     * Conjugue un verbe au temps voulu et au subjonctif si choisi
     *
     * @param verbe      L'infinitif du verbe à conjuguer
     * @param temps      Le temps auquel on souhaite conjuguer le verbe
     * @param subjonctif Conjugue au subjonctif si true
     * @return Un verbe conjugué au 6 personnes
     */
    public String conjugueTemps(String verbe, String temps, boolean subjonctif)
    {
        Verbe v = conjuguerVerbe.conjugue(verbe);
        Temps t = conjuguerTemps.conjugue(temps);

        if (v == null) {
            return erreurVerbe(verbe);
        }
        if (t == null) {
            return erreurTemps(temps);
        }
        if (subjonctif && !(
                temps.equalsIgnoreCase("Présent") ||
                        temps.equalsIgnoreCase("Imparfait") ||
                        temps.equalsIgnoreCase("Passé composé") ||
                        temps.equalsIgnoreCase("Plus-que-parfait")))
        {
            return erreurSubjonctif(temps);
        }

        return t.conjugue(v, subjonctif);
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
     * Le message d'erreur renvoyé lorsqu'un verbe est introuvable
     *
     * @param verbe L'infinitif du verbe
     * @return Message d'erreur
     */
    private String erreurVerbe(String verbe)
    {
        return "ERREUR - Une conjuguaison pour le verbe \"" + verbe + "\" n'est actuellement pas implémenté " +
                "ou n'existe pas";
    }

    /**
     * Le message d'erreur renvoyé lorsqu'un temps est introuvable
     *
     * @param temps L'infinitif du verbe
     * @return Message d'erreur
     */
    private String erreurTemps(String temps)
    {
        return "ERREUR - Le temps \"" + temps + "\" n'est actuellement pas implémenté ou n'existe pas";
    }

    /**
     * Le message d'erreur renvoyé lorsqu'un temps ne se conjugue pas au subjonctif
     *
     * @param temps L'infinitif du verbe
     * @return Message d'erreur
     */
    private String erreurSubjonctif(String temps)
    {
        return "ERREUR - Le temps \"" + temps + "\" ne se conjugue pas au subjonctif";
    }
}
