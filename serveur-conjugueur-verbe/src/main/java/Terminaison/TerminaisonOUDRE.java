package Terminaison;
import Verbe.Verbe;

public class TerminaisonOUDRE extends Verbe
{
	public TerminaisonOUDRE(String verb)
	{
		super(verb);
	}
	
	@Override
	public String terminaison1erePS()
	{
		return "ouds";
	}

	@Override
	public String terminaison2emePS()
	{
		return "ouds";
	}

	@Override
	public String terminaison3emePS()
	{
		return "oud";
	}

	@Override
	public String terminaison1erePP()
	{
		return "ousons";
	}

	@Override
	public String terminaison2emePP()
	{
		return "ousez";
	}

	@Override
	public String terminaison3emePP()
	{
		return "ousent";
	}

	@Override
	public String terminaison()
	{
		return "oudre";
	}

	@Override
	public String MessageErreur()
	{
		return "Verbe en oudre";
	}
}