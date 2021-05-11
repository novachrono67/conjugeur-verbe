package Serveur;

import Expert.*;

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

    public String conjuguerPresent(String verbe)
    {
        return conjuguerVerbe.conjugue(verbe);
    }

    public String conjuguerPasse(String verbe)
    {
        return null;
    }

    public String conjuguerFutur(String verbe)
    {
        return null;
    }
}
