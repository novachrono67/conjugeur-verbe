package temps;

import verbe.Verbe;

public class TempsPasseCompose extends Temps
{
    private static String NOM_TEMPS = "Passé composé";
    private static boolean TEMPS_COMPOSE = true;

    public TempsPasseCompose()
    {
        super(NOM_TEMPS, TEMPS_COMPOSE);
    }

    @Override
    public String conjugue1erePersonneSingulier(Verbe verbe, boolean subjonctif)
    {
        return getPronom1erPS(verbe, subjonctif) + verbe.getAuxiliaire().getAuxiliaire1erePS(this, subjonctif) + verbe.getRadical() + verbe.terminaisonInfinitif();
    }

    @Override
    public String conjugue2emePersonneSingulier(Verbe verbe, boolean subjonctif)
    {
        return getPronom2emePS(subjonctif) + verbe.getAuxiliaire().getAuxiliaire2emePS(this, subjonctif) + verbe.getRadical() + verbe.terminaisonInfinitif();
    }

    @Override
    public String conjugue3emePersonneSingulier(Verbe verbe, boolean subjonctif)
    {
        return getPronom3emePS(subjonctif) + verbe.getAuxiliaire().getAuxiliaire3emePS(this, subjonctif) + verbe.getRadical() + verbe.terminaisonInfinitif();
    }

    @Override
    public String conjugue1erePersonnePluriel(Verbe verbe, boolean subjonctif)
    {
        return getPronom1erePP(subjonctif) + verbe.getAuxiliaire().getAuxiliaire1erePP(this, subjonctif) + verbe.getRadical() + verbe.terminaisonInfinitif();
    }

    @Override
    public String conjugue2emePersonnePluriel(Verbe verbe, boolean subjonctif)
    {
        return getPronom2emePP(subjonctif) + verbe.getAuxiliaire().getAuxiliaire2emePP(this, subjonctif) + verbe.getRadical() + verbe.terminaisonInfinitif();
    }

    @Override
    public String conjugue3emePersonnePluriel(Verbe verbe, boolean subjonctif)
    {
        return getPronom3emePP(subjonctif) + verbe.getAuxiliaire().getAuxiliaire3emePP(this, subjonctif) + verbe.getRadical() + verbe.terminaisonInfinitif();
    }

    public static String getNomTemps()
    {
        return NOM_TEMPS;
    }
}
