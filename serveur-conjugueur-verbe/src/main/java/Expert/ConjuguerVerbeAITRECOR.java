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
	protected String conjugue2(String string)
	{
		if(string.endsWith("aître"))
		{
			Verbe verbe = new TerminaisonAITRE(string);
			return verbe.conjuguePresent();
		}
		return null;
	}

}
