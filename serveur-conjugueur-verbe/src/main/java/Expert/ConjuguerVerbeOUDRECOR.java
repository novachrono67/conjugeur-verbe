package Expert;

import Terminaison.TerminaisonOUDRE;
import main.Verbe;


public class ConjuguerVerbeOUDRECOR extends ConjuguerVerbeCOR {

	public ConjuguerVerbeOUDRECOR(ConjuguerVerbeCOR expertSuivant) {
		super(expertSuivant);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String conjugue2(String string) {
		// TODO Auto-generated method stub
		if(string.endsWith("oudre")){
			Verbe verbe = new TerminaisonOUDRE(string);
			return verbe.conjugue1erePersonneSingulier() + "\n" + verbe.conjugue1erePersonnePluriel() + "\n" + verbe.conjugueParticipePresent() + "\n" + verbe.conjugueParticipePasse() + "\n";
		}
		return null;
	}

}
