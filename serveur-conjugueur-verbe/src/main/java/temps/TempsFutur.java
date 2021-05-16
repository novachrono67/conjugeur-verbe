package temps;

import verbe.Verbe;

public class TempsFutur extends Temps
{
    private static String NOM_TEMPS = "Futur";
    private static boolean TEMPS_COMPOSE = false;

    public TempsFutur()
    {
        super(NOM_TEMPS, TEMPS_COMPOSE);
    }

    @Override
    public String conjugue1erePersonneSingulier(Verbe verbe, boolean subjonctif)
    {
        return getPronom1erPS(verbe, subjonctif) + verbe.getRadical() + verbe.terminaison1erePS_Futur();
    }

    @Override
    public String conjugue2emePersonneSingulier(Verbe verbe, boolean subjonctif)
    {
        return getPronom2emePS(subjonctif) + verbe.getRadical() + verbe.terminaison2emePS_Futur();
    }

    @Override
    public String conjugue3emePersonneSingulier(Verbe verbe, boolean subjonctif)
    {
        return getPronom3emePS(subjonctif) + verbe.getRadical() + verbe.terminaison3emePS_Futur();
    }

    @Override
    public String conjugue1erePersonnePluriel(Verbe verbe, boolean subjonctif)
    {
        return getPronom1erePP(subjonctif) + verbe.getRadical() + verbe.terminaison1erePP_Futur();
    }

    @Override
    public String conjugue2emePersonnePluriel(Verbe verbe, boolean subjonctif)
    {
        return getPronom2emePP(subjonctif) + verbe.getRadical() + verbe.terminaison2emePP_Futur();
    }

    @Override
    public String conjugue3emePersonnePluriel(Verbe verbe, boolean subjonctif)
    {
        return getPronom3emePP(subjonctif) + verbe.getRadical() + verbe.terminaison3emePP_Futur();
    }

    public static String getNomTemps()
    {
        return NOM_TEMPS;
    }
}
