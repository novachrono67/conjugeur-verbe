package Expert;

import Verbe.Verbe;
import Verbe.Verbe1erGroupe;

public class ConjuguerVerbe1erGCOR extends ConjuguerVerbeCOR
{
	public ConjuguerVerbe1erGCOR(ConjuguerVerbeCOR expertSuivant)
	{
		super(expertSuivant);	
	}

	protected String conjugue2(String string)
	{
		if(string.endsWith("er"))
		{
			Verbe verbe = new Verbe1erGroupe(string);
			return verbe.conjuguePresent();
		}
		return null;
	}

	
}
