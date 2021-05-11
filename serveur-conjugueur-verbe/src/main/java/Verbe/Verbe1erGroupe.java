package Verbe;

public class Verbe1erGroupe extends Verbe
{
	public Verbe1erGroupe(String verb){
		super(verb);
	}
	
	public String terminaison1erePS() {
		return "e";
	}

	@Override
	public String terminaison2emePS()
	{
		return "es";
	}

	@Override
	public String terminaison3emePS()
	{
		return "e";
	}

	public String terminaison1erePP() {
		return "ons";
	}

	@Override
	public String terminaison2emePP()
	{
		return "ez";
	}

	@Override
	public String terminaison3emePP()
	{
		return "ent";
	}

	@Override
	public String terminaison() {
		return "er";
	}

	@Override
	public String MessageErreur() {
		return "Verbe1erGroupe";
	}
}


