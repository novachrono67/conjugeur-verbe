package expert.temps;

import temps.Temps;
import verbe.Verbe;

public abstract class ConjuguerTempsCOR implements ConjuguerTemps
{
    protected ConjuguerTempsCOR suivant;

    public ConjuguerTempsCOR(ConjuguerTempsCOR expertSuivant)
    {
        this.suivant = expertSuivant;
    }

    public Temps conjugue(String temps)
    {
        Temps tempsConjugue = this.conjugue1(temps);

        if (tempsConjugue != null) {
            return tempsConjugue;
        } else if (suivant != null) {
            return suivant.conjugue(temps);
        } else return null;
    }

    private Temps conjugue1(String temps)
    {
        Temps tempsConjugue = conjugue2(temps);

        if (tempsConjugue != null) {
            return tempsConjugue;
        } else if (suivant != null) {
            return suivant.conjugue1(temps);
        } else return null;
    }

    protected abstract Temps conjugue2(String string);
}
