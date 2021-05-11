package Expert;

import Terminaison.TerminaisonOUDRE;
import Verbe.Verbe;

public class ConjuguerVerbeOUDRECOR extends ConjuguerVerbeCOR
{
	public ConjuguerVerbeOUDRECOR(ConjuguerVerbeCOR expertSuivant)
	{
		super(expertSuivant);
	}

	@Override
	protected Verbe conjugue2(String string)
	{
		if(string.endsWith("oudre"))
		{
			return new TerminaisonOUDRE(string);
		}
		return null;
	}

}
