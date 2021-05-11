package Personne;
import Verbe.Verbe;

public class PersonneSingulier extends Personne
{
	@Override
	public String fonction(Verbe verbe)
	{
		return verbe.conjugue1erePersonneSingulier();
	}
}
