package temps;

import verbe.Verbe;

public class TempsFutur extends Temps
{
    private static String NOM_TEMPS = "Futur";

    public TempsFutur()
    {
        super(NOM_TEMPS);
    }

    @Override
    public String conjugue1erePersonneSingulier(Verbe verbe)
    {
        if(verbe.toString().substring(0,1).equals("a") || verbe.toString().substring(0,1).equals("e") || verbe.toString().substring(0,1).equals("i") || verbe.toString().substring(0,1).equals("o") || verbe.toString().substring(0,1).equals("u") || verbe.toString().substring(0,1).equals("y")){
            return "J'" + verbe.getRadical() + verbe.terminaison1erePS_Futur();
        }
        else{
            return "Je " + verbe.getRadical() + verbe.terminaison1erePS_Futur();
        }
    }

    @Override
    public String conjugue2emePersonneSingulier(Verbe verbe)
    {
        return "Tu " + verbe.getRadical() + verbe.terminaison2emePS_Futur();
    }

    @Override
    public String conjugue3emePersonneSingulier(Verbe verbe)
    {
        return "Il/Elle " + verbe.getRadical() + verbe.terminaison3emePS_Futur();
    }

    @Override
    public String conjugue1erePersonnePluriel(Verbe verbe)
    {
        return "Nous " + verbe.getRadical() + verbe.terminaison1erePP_Futur();
    }

    @Override
    public String conjugue2emePersonnePluriel(Verbe verbe)
    {
        return "Vous " + verbe.getRadical() + verbe.terminaison2emePP_Futur();
    }

    @Override
    public String conjugue3emePersonnePluriel(Verbe verbe)
    {
        return "Ils/Elles " + verbe.getRadical() + verbe.terminaison3emePP_Futur();
    }

    public static String getNomTemps()
    {
        return NOM_TEMPS;
    }
}
