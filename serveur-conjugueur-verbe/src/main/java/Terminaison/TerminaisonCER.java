package Terminaison;
import Verbe.Verbe;

public class TerminaisonCER extends Verbe {

	public TerminaisonCER(String verb){
		super(verb);
	}
	
	@Override
	public String terminaison1erePS() {
		return "ce";
	}

	@Override
	public String terminaison2emePS()
	{
		return null;
	}

	@Override
	public String terminaison3emePS()
	{
		return null;
	}

	@Override
	public String terminaison1erePP() {
		return "çons";
	}

	@Override
	public String terminaison2emePP()
	{
		return null;
	}

	@Override
	public String terminaison3emePP()
	{
		return null;
	}

	@Override
	public String terminaison() {
		return "cer";
	}

	@Override
	public String MessageErreur() {
		return "Verbe en oudre";
	}
}
