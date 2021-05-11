package Terminaison;
import Verbe.Verbe;

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
}