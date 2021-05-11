package Serveur;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class MainTest
{
	public static void main(String[] args) throws RemoteException
	{
		Conjugaison c = new Conjugaison();
		System.out.println(c.conjuguePresent("flipflop"));

		try
		{
			IConjugaison obj = (IConjugaison) Naming.lookup("rmi://localhost:" + Serveur.PORT_SERVEUR + "/" + Serveur.ENDPOINT_SERVEUR);

			System.out.println(obj.conjuguePresent("flipflop"));
			System.out.println(obj.conjuguerFutur("flipflop"));
			System.out.println(obj.conjuguerPasseCompose("flipflop"));

			System.out.println(obj.conjuguePresent("mettre"));
			System.out.println(obj.conjuguerFutur("mettre"));
			System.out.println(obj.conjuguerPasseCompose("mettre"));

		}
		catch (Exception e)
		{
			System.out.println("Client exception: " + e);
		}
	}
}


