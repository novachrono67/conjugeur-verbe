package expert.verbe;

import terminaison.TerminaisonCER;
import verbe.Verbe;

public class ConjuguerVerbeCERCOR extends ConjuguerVerbeCOR
{
    public ConjuguerVerbeCERCOR(ConjuguerVerbeCOR expertSuivant)
    {
        super(expertSuivant);
    }

    @Override
    protected Verbe conjugue2(String string)
    {
        if(string.endsWith(TerminaisonCER.getTERMINAISON()))
        {
            return new TerminaisonCER(string);
        }
        return null;
    }
}
