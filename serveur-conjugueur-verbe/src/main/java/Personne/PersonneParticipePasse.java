package Personne;
import main.Verbe;

public class PersonneParticipePasse extends Personne {

	@Override
	public String fonction(Verbe verbe) {
		return verbe.conjugueParticipePasse();
	}

}
