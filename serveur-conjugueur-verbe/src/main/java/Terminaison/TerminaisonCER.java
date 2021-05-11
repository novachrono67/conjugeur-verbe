package Terminaison;
import Verbe.Verbe;

public class TerminaisonCER extends Verbe
{
	private static String TERMINAISON = "cer";
	private static String MESSAGE_ERREUR = "Il ne s'agit pas d'un verbe du 1er groupe finissant en \"-cer\"";

	public TerminaisonCER(String verbe)
	{
		super(verbe, TERMINAISON, MESSAGE_ERREUR);
	}
	
	@Override
	public String terminaison1erePS_Present()
	{
		return "ce";
	}

	@Override
	public String terminaison2emePS_Present()
	{
		return null;
	}

	@Override
	public String terminaison3emePS_Present()
	{
		return null;
	}

	@Override
	public String terminaison1erePP_Present()
	{
		return "çons";
	}

	@Override
	public String terminaison2emePP_Present()
	{
		return null;
	}

	@Override
	public String terminaison3emePP_Present()
	{
		return null;
	}
}
