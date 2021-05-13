package terminaison;
import verbe.Verbe;

public class TerminaisonGER extends Verbe
{
    private static String TERMINAISON = "ger";

    public TerminaisonGER(String verbe)
    {
        super(verbe, TERMINAISON);
    }

    @Override
    public String terminaison1erePS_Present()
    {
        return "ge";
    }

    @Override
    public String terminaison2emePS_Present()
    {
        return "ges";
    }

    @Override
    public String terminaison3emePS_Present()
    {
        return "ge";
    }

    @Override
    public String terminaison1erePP_Present()
    {
        return "geons";
    }

    @Override
    public String terminaison2emePP_Present()
    {
        return "gez";
    }

    @Override
    public String terminaison3emePP_Present()
    {
        return "gent";
    }

    @Override
    public String terminaison1erePS_Futur()
    {
        return "gerai";
    }

    @Override
    public String terminaison2emePS_Futur()
    {
        return "geras";
    }

    @Override
    public String terminaison3emePS_Futur()
    {
        return "gera";
    }

    @Override
    public String terminaison1erePP_Futur()
    {
        return "gerons";
    }

    @Override
    public String terminaison2emePP_Futur()
    {
        return "gerez";
    }

    @Override
    public String terminaison3emePP_Futur()
    {
        return "geront";
    }

    @Override
    public String terminaisonInfinitif()
    {
        return "gé";
    }

    public static String getTERMINAISON()
    {
        return TERMINAISON;
    }
}
