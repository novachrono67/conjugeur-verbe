package terminaison;
import verbe.Verbe;

public class TerminaisonCER extends Verbe
{
	private static String TERMINAISON = "cer";

	public TerminaisonCER(String verbe)
	{
		super(verbe, TERMINAISON);
	}
	
	@Override
	public String terminaison1erePS_Present()
	{
		return "ce";
	}

	@Override
	public String terminaison2emePS_Present()
	{
		return "ces";
	}

	@Override
	public String terminaison3emePS_Present()
	{
		return "ce";
	}

	@Override
	public String terminaison1erePP_Present()
	{
		return "çons";
	}

	@Override
	public String terminaison2emePP_Present()
	{
		return "cez";
	}

	@Override
	public String terminaison3emePP_Present()
	{
		return "cent";
	}

	@Override
	public String terminaison1erePS_Futur()
	{
		return "cerai";
	}

	@Override
	public String terminaison2emePS_Futur()
	{
		return "ceras";
	}

	@Override
	public String terminaison3emePS_Futur()
	{
		return "cera";
	}

	@Override
	public String terminaison1erePP_Futur()
	{
		return "cerons";
	}

	@Override
	public String terminaison2emePP_Futur()
	{
		return "cerez";
	}

	@Override
	public String terminaison3emePP_Futur()
	{
		return "ceront";
	}

	@Override
	public String terminaisonInfinitif()
	{
		return "cé";
	}

	public static String getTERMINAISON()
	{
		return TERMINAISON;
	}
}
