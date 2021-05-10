package Personne;
import main.Verbe;

public class PersonnePluriel extends Personne {

	@Override
	public String fonction(Verbe verbe) {
		return verbe.conjugue1erePersonnePluriel();
	}
}
