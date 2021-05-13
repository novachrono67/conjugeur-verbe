package expert.temps;

import temps.Temps;
import temps.TempsFutur;
import temps.TempsPresent;

public class ConjuguerTempsPresentCOR extends ConjuguerTempsCOR
{
    public ConjuguerTempsPresentCOR(ConjuguerTempsCOR expertSuivant)
    {
        super(expertSuivant);
    }

    @Override
    protected Temps conjugue2(String string)
    {
        if (string.equalsIgnoreCase(TempsPresent.getNomTemps())) {
            return new TempsPresent();
        }
        return null;
    }
}
