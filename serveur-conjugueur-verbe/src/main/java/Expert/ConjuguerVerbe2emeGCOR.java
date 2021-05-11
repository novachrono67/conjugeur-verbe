package Expert;

import Verbe.Verbe;
import Verbe.Verbe2emeGroupe;

public class ConjuguerVerbe2emeGCOR extends ConjuguerVerbeCOR
{
	public ConjuguerVerbe2emeGCOR(ConjuguerVerbeCOR expertSuivant)
	{
		super(expertSuivant);
	}

	@Override
	protected String conjugue2(String string)
	{
		if(string.endsWith("ir"))
		{
			Verbe verbe = new Verbe2emeGroupe(string);
			return verbe.conjuguePresent();
		}
		return null;
	}

}
