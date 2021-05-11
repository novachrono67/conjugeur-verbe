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
	protected String conjugue2(String string)
	{
		if(string.endsWith("indre"))
		{
			Verbe verbe = new TerminaisonINDRE(string);
			return verbe.conjuguePresent();
		}
		return null;
	}

}
