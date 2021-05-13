package expert.verbe;

import terminaison.TerminaisonGER;
import verbe.Verbe;

public class ConjuguerVerbeGERCOR extends ConjuguerVerbeCOR
{
    public ConjuguerVerbeGERCOR(ConjuguerVerbeCOR expertSuivant)
    {
        super(expertSuivant);
    }

    @Override
    protected Verbe conjugue2(String string)
    {
        if(string.endsWith(TerminaisonGER.getTERMINAISON()))
        {
            return new TerminaisonGER(string);
        }
        return null;
    }

}



