package expert.temps;

import temps.Temps;
import temps.TempsFutur;

public class ConjuguerTempsFuturCOR extends ConjuguerTempsCOR
{
    public ConjuguerTempsFuturCOR(ConjuguerTempsCOR expertSuivant)
    {
        super(expertSuivant);
    }

    @Override
    protected Temps conjugue2(String string)
    {
        if (string.equalsIgnoreCase(TempsFutur.getNomTemps())) {
            return new TempsFutur();
        }
        return null;
    }
}
