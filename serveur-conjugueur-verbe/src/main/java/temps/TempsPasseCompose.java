package temps;

import verbe.Verbe;

public class TempsPasseCompose extends Temps
{
    private static String NOM_TEMPS = "Passé composé";

    public TempsPasseCompose()
    {
        super(NOM_TEMPS);
    }

    @Override
    public String conjugue1erePersonneSingulier(Verbe verbe)
    {
        return "J'ai " + verbe.getRadical() + verbe.terminaisonInfinitif();
    }

    @Override
    public String conjugue2emePersonneSingulier(Verbe verbe)
    {
        return "Tu as " + verbe.getRadical() + verbe.terminaisonInfinitif();
    }

    @Override
    public String conjugue3emePersonneSingulier(Verbe verbe)
    {
        return "Il/Elle a " + verbe.getRadical() + verbe.terminaisonInfinitif();
    }

    @Override
    public String conjugue1erePersonnePluriel(Verbe verbe)
    {
        return "Nous avons " + verbe.getRadical() + verbe.terminaisonInfinitif();
    }

    @Override
    public String conjugue2emePersonnePluriel(Verbe verbe)
    {
        return "Vous avez " + verbe.getRadical() + verbe.terminaisonInfinitif();
    }

    @Override
    public String conjugue3emePersonnePluriel(Verbe verbe)
    {
        return "Ils/Elles ont " + verbe.getRadical() + verbe.terminaisonInfinitif();
    }

    public static String getNomTemps()
    {
        return NOM_TEMPS;
    }
}
