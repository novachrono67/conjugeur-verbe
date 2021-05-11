package Terminaison;
import Verbe.Verbe;

public class TerminaisonINDRE extends Verbe
{
	private static String TERMINAISON = "indre";
	private static String MESSAGE_ERREUR = "Il ne s'agit pas d'un verbe du 3ème groupe finissant en \"-indre\"";

	public TerminaisonINDRE(String verbe)
	{
		super(verbe, TERMINAISON, MESSAGE_ERREUR);
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
