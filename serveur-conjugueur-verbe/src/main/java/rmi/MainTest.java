package rmi;
import java.rmi.Naming;

public class MainTest
{
	public static void main(String[] args)
	{
		try
		{
			System.out.print("Test de connexion: ");
			IConjugaison obj = (IConjugaison) Naming.lookup("rmi://localhost:" + Serveur.PORT_SERVEUR + "/" + Serveur.ENDPOINT_SERVEUR);
			System.out.println(obj.testConnexion());
			System.out.println(obj.conjuguePresent("mettre"));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}


