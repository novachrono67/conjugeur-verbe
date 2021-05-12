package expert;

import terminaison.TerminaisonOUDRE;
import verbe.Verbe;

public class ConjuguerVerbeOUDRECOR extends ConjuguerVerbeCOR
{
	public ConjuguerVerbeOUDRECOR(ConjuguerVerbeCOR expertSuivant)
	{
		super(expertSuivant);
	}

	@Override
	protected Verbe conjugue2(String string)
	{
		if(string.endsWith(TerminaisonOUDRE.getTERMINAISON()))
		{
			return new TerminaisonOUDRE(string);
		}
		return null;
	}

}
