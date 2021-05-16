package auxilliaire;

import temps.Temps;

public class Avoir extends Auxiliaire
{
    public String getAuxiliaire1erePS(Temps temps, boolean subjonctif)
    {
        if (temps.getTemps().equalsIgnoreCase("Passé composé")) {
            return getPasseCompose1erePS(subjonctif);
        }
        return null;
    }

    public String getAuxiliaire2emePS(Temps temps, boolean subjonctif)
    {
        if (temps.getTemps().equalsIgnoreCase("Passé composé")) {
            return getPasseCompose2emePS(subjonctif);
        }
        return null;
    }

    public String getAuxiliaire3emePS(Temps temps, boolean subjonctif)
    {
        if (temps.getTemps().equalsIgnoreCase("Passé composé")) {
            return getPasseCompose3emePS(subjonctif);
        }
        return null;
    }

    public String getAuxiliaire1erePP(Temps temps, boolean subjonctif)
    {
        if (temps.getTemps().equalsIgnoreCase("Passé composé")) {
            return getPasseCompose1erePP(subjonctif);
        }
        return null;
    }

    public String getAuxiliaire2emePP(Temps temps, boolean subjonctif)
    {
        if (temps.getTemps().equalsIgnoreCase("Passé composé")) {
            return getPasseCompose2emePP(subjonctif);
        }
        return null;
    }

    public String getAuxiliaire3emePP(Temps temps, boolean subjonctif)
    {
        if (temps.getTemps().equalsIgnoreCase("Passé composé")) {
            return getPasseCompose3emePP(subjonctif);
        }
        return null;
    }

    public String getPasseCompose1erePS(boolean subjonctif)
    {
        if (subjonctif) {
            return "aie ";
        }
        return "ai ";
    }

    public String getPasseCompose2emePS(boolean subjonctif)
    {
        if (subjonctif) {
            return "aies ";
        }
        return "as ";
    }

    public String getPasseCompose3emePS(boolean subjonctif)
    {
        if (subjonctif) {
            return "ait ";
        }
        return "a ";
    }

    public String getPasseCompose1erePP(boolean subjonctif)
    {
        if (subjonctif) {
            return "ayons ";
        }
        return "avons ";
    }

    public String getPasseCompose2emePP(boolean subjonctif)
    {
        if (subjonctif) {
            return "ayez ";
        }
        return "avez ";
    }

    public String getPasseCompose3emePP(boolean subjonctif)
    {
        if (subjonctif) {
            return "aient ";
        }
        return "ont ";
    }
}
