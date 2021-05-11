package Verbe;

public abstract class Verbe {
	protected String radical;
	
	public Verbe(String v)
	{
		if(!v.endsWith(this.terminaison()))
		{
			throw new IllegalArgumentException(this.MessageErreur() + " : verbe invalide " + v);
		}
		this.radical = v.substring(0, v.length() - this.terminaison().length());
	}
	
	public String conjugue1erePersonneSingulier()
	{
		return "Je " + radical + terminaison1erePS();
	}

	public String conjugue2emePersonneSingulier()
	{
		return "Tu " + radical + terminaison2emePS();
	}

	public String conjugue3emePersonneSingulier()
	{
		return "Il/Elle " + radical + terminaison3emePS();
	}
	
	public String conjugue1erePersonnePluriel()
	{
		return "Nous " + radical + terminaison1erePP();
	}

	public String conjugue2emePersonnePluriel()
	{
		return "Vous " + radical + terminaison2emePP();
	}

	public String conjugue3emePersonnePluriel()
	{
		return "Ils/Elles " + radical + terminaison3emePP();
	}

	public String conjuguePresent()
	{
		return conjugue1erePersonneSingulier() + "\n" +
				conjugue2emePersonneSingulier() + "\n" +
				conjugue3emePersonneSingulier() + "\n" +
				conjugue1erePersonnePluriel() + "\n" +
				conjugue2emePersonnePluriel() + "\n" +
				conjugue3emePersonnePluriel();
	}
	
	public abstract String terminaison();
	public abstract String MessageErreur();

	public abstract String terminaison1erePS();
	public abstract String terminaison2emePS();
	public abstract String terminaison3emePS();
	public abstract String terminaison1erePP();
	public abstract String terminaison2emePP();
	public abstract String terminaison3emePP();
}
