package auxilliaire;

import temps.Temps;

public class Etre extends Auxiliaire
{
    @Override
    public String getAuxiliaire1erePS(Temps temps, boolean subjonctif)
    {
        if (temps.getTemps().equalsIgnoreCase("Passé composé")) {
            return getPasseCompose1erePS(subjonctif);
        }
        return null;
    }

    @Override
    public String getAuxiliaire2emePS(Temps temps, boolean subjonctif)
    {
        if (temps.getTemps().equalsIgnoreCase("Passé composé")) {
            return getPasseCompose2emePS(subjonctif);
        }
        return null;
    }

    @Override
    public String getAuxiliaire3emePS(Temps temps, boolean subjonctif)
    {
        if (temps.getTemps().equalsIgnoreCase("Passé composé")) {
            return getPasseCompose3emePS(subjonctif);
        }
        return null;
    }

    @Override
    public String getAuxiliaire1erePP(Temps temps, boolean subjonctif)
    {
        if (temps.getTemps().equalsIgnoreCase("Passé composé")) {
            return getPasseCompose1erePP(subjonctif);
        }
        return null;
    }

    @Override
    public String getAuxiliaire2emePP(Temps temps, boolean subjonctif)
    {
        if (temps.getTemps().equalsIgnoreCase("Passé composé")) {
            return getPasseCompose2emePP(subjonctif);
        }
        return null;
    }

    @Override
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
            return "sois ";
        }
        return "suis ";
    }

    public String getPasseCompose2emePS(boolean subjonctif)
    {
        if (subjonctif) {
            return "sois ";
        }
        return "es ";
    }

    public String getPasseCompose3emePS(boolean subjonctif)
    {
        if (subjonctif) {
            return "soit ";
        }
        return "est ";
    }

    public String getPasseCompose1erePP(boolean subjonctif)
    {
        if (subjonctif) {
            return "soyons ";
        }
        return "êtes ";
    }

    public String getPasseCompose2emePP(boolean subjonctif)
    {
        if (subjonctif) {
            return "soyez ";
        }
        return "êtes ";
    }

    public String getPasseCompose3emePP(boolean subjonctif)
    {
        if (subjonctif) {
            return "soient ";
        }
        return "sont ";
    }
}
