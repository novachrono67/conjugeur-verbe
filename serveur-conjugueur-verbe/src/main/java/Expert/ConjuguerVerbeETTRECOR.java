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
	protected Verbe conjugue2(String string)
	{
		if(string.endsWith("ettre"))
		{
			return new TerminaisonETTRE(string);
		}
		return null;
	}

}
