package Terminaison;
import Verbe.Verbe;

public class TerminaisonINDRE extends Verbe
{
	public TerminaisonINDRE(String verb){
		super(verb);
	}

	@Override
	public String terminaison1erePS() {
		return "ins";
	}

	@Override
	public String terminaison2emePS()
	{
		return "ins";
	}

	@Override
	public String terminaison3emePS()
	{
		return "int";
	}

	@Override
	public String terminaison1erePP() {
		return "ignons";
	}

	@Override
	public String terminaison2emePP()
	{
		return "ignez";
	}

	@Override
	public String terminaison3emePP()
	{
		return "ignent";
	}

	@Override
	public String terminaison() {
		return "indre";
	}

	@Override
	public String MessageErreur() {
		return "Verbe en indre";
	}
}
