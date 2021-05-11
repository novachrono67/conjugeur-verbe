package Verbe;

public class Verbe2emeGroupe extends Verbe
{
	private static String TERMINAISON = "oudre";

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
}
