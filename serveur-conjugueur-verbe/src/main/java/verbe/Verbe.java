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

	public String getRadical()
	{
		return this.radical;
	}
}
