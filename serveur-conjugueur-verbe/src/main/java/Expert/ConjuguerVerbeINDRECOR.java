package Expert;

import Terminaison.TerminaisonINDRE;
import Verbe.Verbe;

public class ConjuguerVerbeINDRECOR extends ConjuguerVerbeCOR
{
	public ConjuguerVerbeINDRECOR(ConjuguerVerbeCOR expertSuivant)
	{
		super(expertSuivant);
	}

	@Override
	protected Verbe conjugue2(String string)
	{
		if(string.endsWith("indre"))
		{
			return new TerminaisonINDRE(string);
		}
		return null;
	}

}
