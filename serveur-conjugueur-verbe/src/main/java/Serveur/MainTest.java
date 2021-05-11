package Serveur;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.Naming;

import Expert.ConjuguerVerbe;
import Expert.ConjuguerVerbe1erGCOR;
import Expert.ConjuguerVerbe2emeGCOR;
import Expert.ConjuguerVerbeAITRECOR;
import Expert.ConjuguerVerbeCOR;
import Expert.ConjuguerVerbeINDRECOR;
import Expert.ConjuguerVerbeOUDRECOR;
import Expert.ConjuguerVerbeETTRECOR;

public class MainTest
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			IConjugaison obj = (IConjugaison) Naming.lookup("rmi://localhost:" + Serveur.PORT_SERVEUR + "/" + Serveur.ENDPOINT_SERVEUR);
			System.out.println(obj.conjuguerPresent("chanter"));
		}
		catch (Exception e)
		{
			System.out.println("Client exception: " + e);
		}
	}
}


