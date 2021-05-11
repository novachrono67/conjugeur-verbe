package Verbe;

public abstract class Verbe
 {
	protected String radical;
	protected String terminaison;

	public Verbe(String v, String terminaison)
	{
		this.terminaison = terminaison;
		this.radical = v.substring(0, v.length() - this.terminaison.length());
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
	
	public String conjugue1erePersonneSingulier()
	{
		return "Je " + radical + terminaison1erePS_Present();
	}

	public String conjugue2emePersonneSingulier()
	{
		return "Tu " + radical + terminaison2emePS_Present();
	}

	public String conjugue3emePersonneSingulier()
	{
		return "Il/Elle " + radical + terminaison3emePS_Present();
	}
	
	public String conjugue1erePersonnePluriel()
	{
		return "Nous " + radical + terminaison1erePP_Present();
	}

	public String conjugue2emePersonnePluriel()
	{
		return "Vous " + radical + terminaison2emePP_Present();
	}

	public String conjugue3emePersonnePluriel()
	{
		return "Ils/Elles " + radical + terminaison3emePP_Present();
	}

	public abstract String terminaison1erePS_Present();
	public abstract String terminaison2emePS_Present();
	public abstract String terminaison3emePS_Present();
	public abstract String terminaison1erePP_Present();
	public abstract String terminaison2emePP_Present();
	public abstract String terminaison3emePP_Present();
}
