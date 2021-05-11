package Expert;

import Terminaison.TerminaisonETTRE;
import Verbe.Verbe;

public class ConjuguerVerbeETTRECOR extends ConjuguerVerbeCOR
{
	public ConjuguerVerbeETTRECOR(ConjuguerVerbeCOR expertSuivant)
	{
		super(expertSuivant);
	}

	@Override
	protected String conjugue2(String string)
	{
		if(string.endsWith("ettre"))
		{
			Verbe verbe = new TerminaisonETTRE(string);
			return verbe.conjuguePresent();
		}
		return null;
	}

}
