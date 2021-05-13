package expert.verbe;

import terminaison.TerminaisonINDRE;
import verbe.Verbe;

public class ConjuguerVerbeINDRECOR extends ConjuguerVerbeCOR
{
	public ConjuguerVerbeINDRECOR(ConjuguerVerbeCOR expertSuivant)
	{
		super(expertSuivant);
	}

	@Override
	protected Verbe conjugue2(String string)
	{
		if(string.endsWith(TerminaisonINDRE.getTERMINAISON()))
		{
			return new TerminaisonINDRE(string);
		}
		return null;
	}

}
