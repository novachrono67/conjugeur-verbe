package expert.temps;

import temps.Temps;
import temps.TempsPasseCompose;

public class ConjuguerTempsPasseComposeCOR extends ConjuguerTempsCOR
{
    public ConjuguerTempsPasseComposeCOR(ConjuguerTempsCOR expertSuivant)
    {
        super(expertSuivant);
    }

    @Override
    protected Temps conjugue2(String string)
    {
        if (string.equalsIgnoreCase(TempsPasseCompose.getNomTemps())) {
            return new TempsPasseCompose();
        }
        return null;
    }
}
