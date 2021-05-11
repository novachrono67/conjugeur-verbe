package Expert;

import Terminaison.TerminaisonAITRE;
import Verbe.Verbe;

public class ConjuguerVerbeAITRECOR extends ConjuguerVerbeCOR
{
	public ConjuguerVerbeAITRECOR(ConjuguerVerbeCOR expertSuivant)
	{
		super(expertSuivant);
	}

	@Override
	protected Verbe conjugue2(String string)
	{
		if(string.endsWith("a�tre"))
		{
			return new TerminaisonAITRE(string);
		}
		return null;
	}

}
