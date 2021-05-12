package verbe;

/**
 * Classe contenant le radical et la terminaison d'un verbe et permettant de conjuguer ce verbe
 */
public abstract class Verbe
{

	protected String radical;
	protected String terminaison;

	/**
	 * Constructeur permettant de créer un objet verbe
	 *
	 * @param v           L'infinitif du verbe
	 * @param terminaison La terminaison du verbe
	 */
	public Verbe(String v, String terminaison)
	{
		this.terminaison = terminaison;
		this.radical = v.substring(0, v.length() - this.terminaison.length());
	}

	/**
	 * Crée un string contenant la conjuguaison au présent simple des 3 personnes du singulier et du pluriel
	 *
	 * @return
	 */
	public String conjuguePresent()
	{
		return conjugue1erePersonneSingulier_Present() + "\n" +
				conjugue2emePersonneSingulier_Present() + "\n" +
				conjugue3emePersonneSingulier_Present() + "\n" +
				conjugue1erePersonnePluriel_Present() + "\n" +
				conjugue2emePersonnePluriel_Present() + "\n" +
				conjugue3emePersonnePluriel_Present();
	}

	/**
	 * Crée un string contenant la conjuguaison au futur simple des 3 personnes du singulier et du pluriel
	 *
	 * @return
	 */
	public String conjugueFutur()
	{
		return conjugue1erePersonneSingulier_Futur() + "\n" +
				conjugue2emePersonneSingulier_Futur() + "\n" +
				conjugue3emePersonneSingulier_Futur() + "\n" +
				conjugue1erePersonnePluriel_Futur() + "\n" +
				conjugue2emePersonnePluriel_Futur() + "\n" +
				conjugue3emePersonnePluriel_Futur();
	}

	/**
	 * Crée un string contenant la conuguaison au passé composé des 3 personnes du singulier et du pluriel
	 *
	 * @return
	 */
	public String conjuguePasse()
	{
		return conjugue1erePersonneSingulier_Passe() + "\n" +
				conjugue2emePersonneSingulier_Passe() + "\n" +
				conjugue3emePersonneSingulier_Passe() + "\n" +
				conjugue1erePersonnePluriel_Passe() + "\n" +
				conjugue2emePersonnePluriel_Passe() + "\n" +
				conjugue3emePersonnePluriel_Passe();
	}

	//Conjugaisons au présent simple
	private String conjugue1erePersonneSingulier_Present()
	{
		return "Je " + radical + terminaison1erePS_Present();
	}

	private String conjugue2emePersonneSingulier_Present()
	{
		return "Tu " + radical + terminaison2emePS_Present();
	}

	private String conjugue3emePersonneSingulier_Present()
	{
		return "Il/Elle " + radical + terminaison3emePS_Present();
	}

	private String conjugue1erePersonnePluriel_Present()
	{
		return "Nous " + radical + terminaison1erePP_Present();
	}

	private String conjugue2emePersonnePluriel_Present()
	{
		return "Vous " + radical + terminaison2emePP_Present();
	}

	private String conjugue3emePersonnePluriel_Present()
	{
		return "Ils/Elles " + radical + terminaison3emePP_Present();
	}

	//Conjugaisons au futur simple
	private String conjugue1erePersonneSingulier_Futur()
	{
		return "Je " + radical + terminaison1erePS_Futur();
	}

	private String conjugue2emePersonneSingulier_Futur()
	{
		return "Tu " + radical + terminaison2emePS_Futur();
	}

	private String conjugue3emePersonneSingulier_Futur()
	{
		return "Il/Elle " + radical + terminaison3emePS_Futur();
	}

	private String conjugue1erePersonnePluriel_Futur()
	{
		return "Nous " + radical + terminaison1erePP_Futur();
	}

	private String conjugue2emePersonnePluriel_Futur()
	{
		return "Vous " + radical + terminaison2emePP_Futur();
	}

	private String conjugue3emePersonnePluriel_Futur()
	{
		return "Ils/Elles " + radical + terminaison3emePP_Futur();
	}

	//Conjugaisons au passé composé
	private String conjugue1erePersonneSingulier_Passe()
	{
		return "J'ai " + radical + terminaisonInfinitif();
	}

	private String conjugue2emePersonneSingulier_Passe()
	{
		return "Tu as " + radical + terminaisonInfinitif();
	}

	private String conjugue3emePersonneSingulier_Passe()
	{
		return "Il/Elle a " + radical + terminaisonInfinitif();
	}

	private String conjugue1erePersonnePluriel_Passe()
	{
		return "Nous avons " + radical + terminaisonInfinitif();
	}

	private String conjugue2emePersonnePluriel_Passe()
	{
		return "Vous avez " + radical + terminaisonInfinitif();
	}

	private String conjugue3emePersonnePluriel_Passe()
	{
		return "Ils/Elles ont " + radical + terminaisonInfinitif();
	}


	//Terminaisons au présent simple
	public abstract String terminaison1erePS_Present();

	public abstract String terminaison2emePS_Present();

	public abstract String terminaison3emePS_Present();

	public abstract String terminaison1erePP_Present();

	public abstract String terminaison2emePP_Present();

	public abstract String terminaison3emePP_Present();

	//Terminaison au futur simple
	public abstract String terminaison1erePS_Futur();

	public abstract String terminaison2emePS_Futur();

	public abstract String terminaison3emePS_Futur();

	public abstract String terminaison1erePP_Futur();

	public abstract String terminaison2emePP_Futur();

	public abstract String terminaison3emePP_Futur();

	//Terminaison à l'infinitif
	public abstract String terminaisonInfinitif();
}
