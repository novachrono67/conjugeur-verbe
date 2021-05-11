package Terminaison;
import Verbe.Verbe;

public class TerminaisonAITRE extends Verbe
{
	public TerminaisonAITRE(String verb){
		super(verb);
	}

	@Override
	public String terminaison1erePS()
	{
		return "ais";
	}

	@Override
	public String terminaison2emePS()
	{
		return "ais";
	}

	@Override
	public String terminaison3emePS()
	{
		return "a�t";
	}

	@Override
	public String terminaison1erePP()
	{
		return "aissons";
	}

	@Override
	public String terminaison2emePP()
	{
		return "aissez";
	}

	@Override
	public String terminaison3emePP()
	{
		return "aissent";
	}

	@Override
	public String terminaison()
	{
		return "a�tre";
	}

	@Override
	public String MessageErreur()
	{
		return "Verbe en a�tre";
	}

}