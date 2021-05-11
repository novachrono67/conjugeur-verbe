package Serveur;
import java.rmi.Naming;

public class MainTest
{
	public static void main(String[] args)
	{
		try
		{
			IConjugaison obj = (IConjugaison) Naming.lookup("rmi://localhost:" + Serveur.PORT_SERVEUR + "/" + Serveur.ENDPOINT_SERVEUR);
			System.out.println(obj.conjuguePresent("qerfbngmb"));
		}
		catch (Exception e)
		{
			System.out.println("Client exception: " + e);
		}
	}
}


