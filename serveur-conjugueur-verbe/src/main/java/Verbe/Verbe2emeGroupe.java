package Verbe;

public class Verbe2emeGroupe extends Verbe
{
	public Verbe2emeGroupe(String verb)
	{
		super(verb);
	}
	
	public String terminaison1erePS()
	{
		return "is";
	}

	@Override
	public String terminaison2emePS()
	{
		return "is";
	}

	@Override
	public String terminaison3emePS()
	{
		return "it";
	}

	public String terminaison1erePP()
	{
		return "issons";
	}

	@Override
	public String terminaison2emePP()
	{
		return "issez";
	}

	@Override
	public String terminaison3emePP()
	{
		return "issent";
	}

	@Override
	public String terminaison()
	{
		return "ir";
	}

	@Override
	public String MessageErreur()
	{
		return "Verbe2emeGroupe";
	}
}
