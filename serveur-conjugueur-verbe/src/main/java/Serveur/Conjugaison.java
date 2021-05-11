package Serveur;

import Expert.*;
import Verbe.Verbe;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Conjugaison extends UnicastRemoteObject implements IConjugaison
{
    private ConjuguerVerbe conjuguerVerbe;

    public Conjugaison() throws RemoteException
    {
        super();
        ConjuguerVerbeCOR conjuguerVerbe1erG, conjuguerVerbe2emeG, conjuguerVerbeAITRE, conjuguerVerbeOUDRE, conjuguerVerbeETTRE, conjuguerVerbeINDRE;
        conjuguerVerbe1erG = new ConjuguerVerbe1erGCOR(null);
        conjuguerVerbe2emeG = new ConjuguerVerbe2emeGCOR(conjuguerVerbe1erG);
        conjuguerVerbeAITRE = new ConjuguerVerbeAITRECOR(conjuguerVerbe2emeG);
        conjuguerVerbeOUDRE = new ConjuguerVerbeOUDRECOR(conjuguerVerbeAITRE);
        conjuguerVerbeETTRE = new ConjuguerVerbeETTRECOR(conjuguerVerbeOUDRE);
        conjuguerVerbeINDRE = new ConjuguerVerbeINDRECOR(conjuguerVerbeETTRE);
        this.conjuguerVerbe = conjuguerVerbeINDRE;
    }

    public String conjuguePresent(String verbe)
    {
        Verbe v = conjuguerVerbe.conjugue(verbe);
        if(v == null)
        {
            return "ERREUR - Aucune conjugaison n'a été trouvée pour le verbe \"" + verbe + "\"";
        }
        return v.conjuguePresent();
    }

    public String conjuguerFutur(String verbe)
    {
        Verbe v = conjuguerVerbe.conjugue(verbe);
        if(v == null)
        {
            return "ERREUR - Aucune conjugaison n'a été trouvée pour le verbe \"" + verbe + "\"";
        }
        return v.conjugueFutur();
    }

    public String conjuguerPasseCompose(String verbe)
    {
        Verbe v = conjuguerVerbe.conjugue(verbe);
        if(v == null)
        {
            return "ERREUR - Aucune conjugaison n'a été trouvée pour le verbe \"" + verbe + "\"";
        }
        return v.conjuguePasse();
    }

    public boolean testConnexion()
    {
        return true;
    }
}
