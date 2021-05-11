package expert;

import verbe.Verbe;
import verbe.Verbe1erGroupe;

public class ConjuguerVerbe1erGCOR extends ConjuguerVerbeCOR
{
	public ConjuguerVerbe1erGCOR(ConjuguerVerbeCOR expertSuivant)
	{
		super(expertSuivant);	
	}

	protected Verbe conjugue2(String string)
	{
		if(string.endsWith("er"))
		{
			return new Verbe1erGroupe(string);
		}
		return null;
	}

	
}
