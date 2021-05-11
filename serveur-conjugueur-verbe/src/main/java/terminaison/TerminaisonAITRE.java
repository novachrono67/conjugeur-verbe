package terminaison;
import verbe.Verbe;

public class TerminaisonAITRE extends Verbe
{
	private static String TERMINAISON = "a�tre";

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
		return "a�t";
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
		return "a�trai";
	}

	@Override
	public String terminaison2emePS_Futur()
	{
		return "a�tras";
	}

	@Override
	public String terminaison3emePS_Futur()
	{
		return "a�tra";
	}

	@Override
	public String terminaison1erePP_Futur()
	{
		return "a�trons";
	}

	@Override
	public String terminaison2emePP_Futur()
	{
		return "a�trez";
	}

	@Override
	public String terminaison3emePP_Futur()
	{
		return "a�tront";
	}

	@Override
	public String terminaisonInfinitif()
	{
		return "u";
	}
}