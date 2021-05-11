package Verbe;

public class Verbe2emeGroupe extends Verbe
{
	private static String TERMINAISON = "ir";

	public Verbe2emeGroupe(String verbe)
	{
		super(verbe, TERMINAISON);
	}

	@Override
	public String terminaison1erePS_Present()
	{
		return "is";
	}

	@Override
	public String terminaison2emePS_Present()
	{
		return "is";
	}

	@Override
	public String terminaison3emePS_Present()
	{
		return "it";
	}

	public String terminaison1erePP_Present()
	{
		return "issons";
	}

	@Override
	public String terminaison2emePP_Present()
	{
		return "issez";
	}

	@Override
	public String terminaison3emePP_Present()
	{
		return "issent";
	}

	@Override
	public String terminaison1erePS_Futur()
	{
		return "irai";
	}

	@Override
	public String terminaison2emePS_Futur()
	{
		return "iras";
	}

	@Override
	public String terminaison3emePS_Futur()
	{
		return "ira";
	}

	@Override
	public String terminaison1erePP_Futur()
	{
		return "irons";
	}

	@Override
	public String terminaison2emePP_Futur()
	{
		return "irez";
	}

	@Override
	public String terminaison3emePP_Futur()
	{
		return "iront";
	}

	@Override
	public String terminaisonInfinitif()
	{
		return "i";
	}
}
