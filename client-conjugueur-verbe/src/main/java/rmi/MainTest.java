package rmi;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MainTest
{
	public static int PORT_SERVEUR = 1249;
	public static String ENDPOINT_SERVEUR = "conjugaison";

	public static void main(String[] args)
	{
		try
		{
			Registry registry = LocateRegistry.getRegistry(1249);
			System.out.println("RMI Registry: " + registry.toString() + "\n");

			System.out.print("Test de connexion: ");
			IConjugaison obj = (IConjugaison) Naming.lookup("rmi://localhost:" + PORT_SERVEUR + "/" + ENDPOINT_SERVEUR);
			System.out.println(obj.testConnexion() + "\n");

			System.out.println(obj.conjuguePresent("mettre"));

		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}


