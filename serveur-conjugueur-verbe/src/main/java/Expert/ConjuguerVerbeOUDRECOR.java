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
	protected String conjugue2(String string)
	{
		if(string.endsWith("oudre"))
		{
			Verbe verbe = new TerminaisonOUDRE(string);
			return verbe.conjuguePresent();
		}
		return null;
	}

}
