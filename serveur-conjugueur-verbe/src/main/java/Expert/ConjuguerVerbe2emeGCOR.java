package Expert;

import main.Verbe;
import main.Verbe2emeGroupe;

public class ConjuguerVerbe2emeGCOR extends ConjuguerVerbeCOR {

	public ConjuguerVerbe2emeGCOR(ConjuguerVerbeCOR expertSuivant) {
		super(expertSuivant);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String conjugue2(String string) {
		if(string.endsWith("ir")){
			Verbe verbe = new Verbe2emeGroupe(string);
			return verbe.conjugue1erePersonneSingulier() + "\n" + verbe.conjugue1erePersonnePluriel() + "\n" + verbe.conjugueParticipePresent() + "\n" + verbe.conjugueParticipePasse() + "\n";
		}
		return null;
	}

}
