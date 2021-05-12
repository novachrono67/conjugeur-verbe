package rmi;

import expert.*;
import verbe.Verbe;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Conjugaison extends UnicastRemoteObject implements IConjugaison
{
    private ConjuguerVerbe conjuguerVerbe;

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

    public String conjuguePresent(String verbe)
    {
        Verbe v = conjuguerVerbe.conjugue(verbe);
        if(v == null)
        {
            return getMessageErreur(verbe);
        }
        return v.conjuguePresent();
    }

    public String conjugueFutur(String verbe)
    {
        Verbe v = conjuguerVerbe.conjugue(verbe);
        if(v == null)
        {
            return getMessageErreur(verbe);
        }
        return v.conjugueFutur();
    }

    public String conjuguePasseCompose(String verbe)
    {
        Verbe v = conjuguerVerbe.conjugue(verbe);
        if(v == null)
        {
            return getMessageErreur(verbe);
        }
        return v.conjuguePasse();
    }

    public boolean testConnexion()
    {
        return true;
    }

    private String getMessageErreur(String verbe)
    {
        return "ERREUR - Aucune conjugaison n'a été trouvée pour le verbe \"" + verbe + "\"";
    }
}
