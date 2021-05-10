package Expert;

import main.Verbe;
import main.Verbe1erGroupe;

public class ConjuguerVerbe1erGCOR extends ConjuguerVerbeCOR {

	public ConjuguerVerbe1erGCOR(ConjuguerVerbeCOR expertSuivant) {
		super(expertSuivant);	
	}

	
	
	protected String conjugue2(String string) {
		if(string.endsWith("er")){
			Verbe verbe = new Verbe1erGroupe(string);
			return verbe.conjugue1erePersonneSingulier() + "\n" + verbe.conjugue1erePersonnePluriel() + "\n" + verbe.conjugueParticipePresent() + "\n" + verbe.conjugueParticipePasse() + "\n";
		}
		return null;
	}

	
}
