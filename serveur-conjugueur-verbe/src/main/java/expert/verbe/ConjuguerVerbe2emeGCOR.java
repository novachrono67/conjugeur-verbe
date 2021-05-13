package expert.verbe;

import verbe.Verbe;
import verbe.Verbe2emeGroupe;

public class ConjuguerVerbe2emeGCOR extends ConjuguerVerbeCOR
{
	public ConjuguerVerbe2emeGCOR(ConjuguerVerbeCOR expertSuivant)
	{
		super(expertSuivant);
	}

	@Override
	protected Verbe conjugue2(String string)
	{
		if(string.endsWith(Verbe2emeGroupe.getTERMINAISON()))
		{
			return new Verbe2emeGroupe(string);
		}
		return null;
	}

}
