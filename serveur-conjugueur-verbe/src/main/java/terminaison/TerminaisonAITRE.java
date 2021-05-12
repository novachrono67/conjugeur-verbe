package terminaison;
import verbe.Verbe;

public class TerminaisonAITRE extends Verbe
{
	private static String TERMINAISON = "aître";

	public TerminaisonAITRE(String verbe)
	{
		super(verbe, TERMINAISON);
	}

	@Override
	public String terminaison1erePS_Present()
	{
		return "ais";
	}

	@Override
	public String terminaison2emePS_Present()
	{
		return "ais";
	}

	@Override
	public String terminaison3emePS_Present()
	{
		return "aît";
	}

	@Override
	public String terminaison1erePP_Present()
	{
		return "aissons";
	}

	@Override
	public String terminaison2emePP_Present()
	{
		return "aissez";
	}

	@Override
	public String terminaison3emePP_Present()
	{
		return "aissent";
	}

	@Override
	public String terminaison1erePS_Futur()
	{
		return "aîtrai";
	}

	@Override
	public String terminaison2emePS_Futur()
	{
		return "aîtras";
	}

	@Override
	public String terminaison3emePS_Futur()
	{
		return "aitra";
	}

	@Override
	public String terminaison1erePP_Futur()
	{
		return "aîtrons";
	}

	@Override
	public String terminaison2emePP_Futur()
	{
		return "aîtrez";
	}

	@Override
	public String terminaison3emePP_Futur()
	{
		return "aîtront";
	}

	@Override
	public String terminaisonInfinitif()
	{
		return "u";
	}

	public static String getTERMINAISON()
	{
		return TERMINAISON;
	}
}