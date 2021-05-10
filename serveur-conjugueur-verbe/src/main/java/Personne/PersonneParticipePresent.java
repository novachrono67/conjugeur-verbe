package Personne;
import main.Verbe;

public class PersonneParticipePresent extends Personne {

	@Override
	public String fonction(Verbe verbe) {
		return verbe.conjugueParticipePresent();
	}

}
