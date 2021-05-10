package Expert;

import Terminaison.TerminaisonAITRE;
import main.Verbe;


public class ConjuguerVerbeAITRECOR extends ConjuguerVerbeCOR {

	public ConjuguerVerbeAITRECOR(ConjuguerVerbeCOR expertSuivant) {
		super(expertSuivant);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String conjugue2(String string) {
		// TODO Auto-generated method stub
		if(string.endsWith("aître")){
			Verbe verbe = new TerminaisonAITRE(string);
			return verbe.conjugue1erePersonneSingulier() + "\n" + verbe.conjugue1erePersonnePluriel() + "\n" + verbe.conjugueParticipePresent() + "\n" + verbe.conjugueParticipePasse() + "\n";
		}
		return null;
	}

}
