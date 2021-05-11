package Terminaison;
import Verbe.Verbe;

public class TerminaisonETTRE extends Verbe
{
	public TerminaisonETTRE(String verb){
		super(verb);
	}
	
	@Override
	public String terminaison1erePS() {
		return "ets";
	}

	@Override
	public String terminaison2emePS()
	{
		return "ets";
	}

	@Override
	public String terminaison3emePS()
	{
		return "et";
	}

	@Override
	public String terminaison1erePP() {
		return "ettons";
	}

	@Override
	public String terminaison2emePP()
	{
		return "ettez";
	}

	@Override
	public String terminaison3emePP()
	{
		return "ettent";
	}

	@Override
	public String terminaison() {
		return "ettre";
	}

	@Override
	public String MessageErreur() {
		return "Verbe en ettre";
	}
}
