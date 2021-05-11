package Terminaison;
import Verbe.Verbe;

public class TerminaisonINDRE extends Verbe
{
	private static String TERMINAISON = "indre";

	public TerminaisonINDRE(String verbe)
	{
		super(verbe, TERMINAISON);
	}

	@Override
	public String terminaison1erePS_Present()
	{
		return "ins";
	}

	@Override
	public String terminaison2emePS_Present()
	{
		return "ins";
	}

	@Override
	public String terminaison3emePS_Present()
	{
		return "int";
	}

	@Override
	public String terminaison1erePP_Present()
	{
		return "ignons";
	}

	@Override
	public String terminaison2emePP_Present()
	{
		return "ignez";
	}

	@Override
	public String terminaison3emePP_Present()
	{
		return "ignent";
	}
}
