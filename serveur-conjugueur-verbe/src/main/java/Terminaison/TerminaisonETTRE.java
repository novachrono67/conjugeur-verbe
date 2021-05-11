package Terminaison;
import Verbe.Verbe;

public class TerminaisonETTRE extends Verbe
{
	private static String TERMINAISON = "ettre";

	public TerminaisonETTRE(String verbe)
	{
		super(verbe, TERMINAISON);
	}

	@Override
	public String terminaison1erePS_Present()
	{
		return "ets";
	}

	@Override
	public String terminaison2emePS_Present()
	{
		return "ets";
	}

	@Override
	public String terminaison3emePS_Present()
	{
		return "et";
	}

	@Override
	public String terminaison1erePP_Present()
	{
		return "ettons";
	}

	@Override
	public String terminaison2emePP_Present()
	{
		return "ettez";
	}

	@Override
	public String terminaison3emePP_Present()
	{
		return "ettent";
	}
}
