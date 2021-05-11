package Personne;
import Verbe.Verbe;

public class ListeVerbes
{
	public static String ConjugueUneListe(Verbe[] listeVerbes, Personne personne)
	{
		String Liste = "";
		for(int i=0;i<listeVerbes.length;i++)
		{
			 Liste = Liste + personne.fonction(listeVerbes[i]) + "\n";
		}
		return Liste;
	}
}
