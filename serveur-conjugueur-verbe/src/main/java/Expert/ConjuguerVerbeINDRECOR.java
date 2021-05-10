package Expert;

import Terminaison.TerminaisonINDRE;
import main.Verbe;


public class ConjuguerVerbeINDRECOR extends ConjuguerVerbeCOR {

	public ConjuguerVerbeINDRECOR(ConjuguerVerbeCOR expertSuivant) {
		super(expertSuivant);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String conjugue2(String string) {
		// TODO Auto-generated method stub
		if(string.endsWith("indre")){
			Verbe verbe = new TerminaisonINDRE(string);
			return verbe.conjugue1erePersonneSingulier() + "\n" + verbe.conjugue1erePersonnePluriel() + "\n" + verbe.conjugueParticipePresent() + "\n" + verbe.conjugueParticipePasse() + "\n";
		}
		return null;
	}

}
