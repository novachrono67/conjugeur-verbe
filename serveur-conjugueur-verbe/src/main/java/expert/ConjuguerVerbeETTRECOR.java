package expert;

import terminaison.TerminaisonETTRE;
import verbe.Verbe;

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
