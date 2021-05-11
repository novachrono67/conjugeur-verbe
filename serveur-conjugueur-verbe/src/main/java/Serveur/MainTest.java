package Serveur;
import java.rmi.Naming;

public class MainTest
{
	public static void main(String[] args)
	{
		try
		{
			System.out.print("Test de connexion: ");
			IConjugaison obj = (IConjugaison) Naming.lookup("rmi://localhost:" + Serveur.PORT_SERVEUR + "/" + Serveur.ENDPOINT_SERVEUR);
			System.out.print(obj.testConnexion());

			System.out.println(obj.conjuguePresent("flipflop"));
			System.out.println(obj.conjugueFutur("flipflop"));
			System.out.println(obj.conjuguePasseCompose("flipflop"));

			System.out.println(obj.conjuguePresent("mettre"));
			System.out.println(obj.conjugueFutur("mettre"));
			System.out.println(obj.conjuguePasseCompose("mettre"));

		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}


