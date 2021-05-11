package Verbe;

public class Verbe1erGroupe extends Verbe
{
	private static String TERMINAISON = "er";

	public Verbe1erGroupe(String verbe){
		super(verbe, TERMINAISON);
	}

	@Override
	public String terminaison1erePS_Present()
	{
		return "e";
	}

	@Override
	public String terminaison2emePS_Present()
	{
		return "es";
	}

	@Override
	public String terminaison3emePS_Present()
	{
		return "e";
	}

	public String terminaison1erePP_Present()
	{
		return "ons";
	}

	@Override
	public String terminaison2emePP_Present()
	{
		return "ez";
	}

	@Override
	public String terminaison3emePP_Present()
	{
		return "ent";
	}

	@Override
	public String terminaison1erePS_Futur()
	{
		return "ai";
	}

	@Override
	public String terminaison2emePS_Futur()
	{
		return "as";
	}

	@Override
	public String terminaison3emePS_Futur()
	{
		return "a";
	}

	@Override
	public String terminaison1erePP_Futur()
	{
		return "ons";
	}

	@Override
	public String terminaison2emePP_Futur()
	{
		return "ez";
	}

	@Override
	public String terminaison3emePP_Futur()
	{
		return "ont";
	}

	@Override
	public String terminaisonInfinitif()
	{
		return "�";
	}
}

