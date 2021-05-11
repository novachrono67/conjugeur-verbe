package Terminaison;
import Verbe.Verbe;

public class TerminaisonOUDRE extends Verbe
{
	private static String TERMINAISON = "oudre";
	private static String MESSAGE_ERREUR = "Il ne s'agit pas d'un verbe du 3ème groupe finissant en \"-oudre\"";

	public TerminaisonOUDRE(String verbe)
	{
		super(verbe, TERMINAISON, MESSAGE_ERREUR);
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
}