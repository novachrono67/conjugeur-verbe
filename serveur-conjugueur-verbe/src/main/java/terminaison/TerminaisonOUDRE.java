package terminaison;
import verbe.Verbe;

public class TerminaisonOUDRE extends Verbe
{
	private static String TERMINAISON = "oudre";

	public TerminaisonOUDRE(String verbe)
	{
		super(verbe, TERMINAISON);
	}
	
	@Override
	public String terminaison1erePS_Present()
	{
		return "ouds";
	}

	@Override
	public String terminaison2emePS_Present()
	{
		return "ouds";
	}

	@Override
	public String terminaison3emePS_Present()
	{
		return "oud";
	}

	@Override
	public String terminaison1erePP_Present()
	{
		return "ousons";
	}

	@Override
	public String terminaison2emePP_Present()
	{
		return "ousez";
	}

	@Override
	public String terminaison3emePP_Present()
	{
		return "ousent";
	}

	@Override
	public String terminaison1erePS_Futur()
	{
		return "oudrai";
	}

	@Override
	public String terminaison2emePS_Futur()
	{
		return "oudras";
	}

	@Override
	public String terminaison3emePS_Futur()
	{
		return "oudra";
	}

	@Override
	public String terminaison1erePP_Futur()
	{
		return "oudrons";
	}

	@Override
	public String terminaison2emePP_Futur()
	{
		return "oudrez";
	}

	@Override
	public String terminaison3emePP_Futur()
	{
		return "oudront";
	}

	@Override
	public String terminaisonInfinitif()
	{
		return "oulu";
	}

	public static String getTERMINAISON()
	{
		return TERMINAISON;
	}
}