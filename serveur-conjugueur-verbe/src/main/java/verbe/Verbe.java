package verbe;

import auxilliaire.Auxiliaire;

/**
 * Classe contenant le radical et la terminaison d'un verbe et permettant de conjuguer ce verbe
 */
public abstract class Verbe
{
	protected String radical;
	protected String terminaison;
	protected Auxiliaire auxiliaire;

	/**
	 * Constructeur permettant de créer un objet verbe
	 *
	 * @param verbe       L'infinitif du verbe
	 * @param terminaison La terminaison du verbe
	 */
	public Verbe(String verbe, String terminaison)
	{
		this.terminaison = terminaison;
		this.radical = verbe.substring(0, verbe.length() - this.terminaison.length());
		this.auxiliaire = Auxiliaire.getAuxiliaire(verbe);
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

	public Auxiliaire getAuxiliaire()
	{
		return auxiliaire;
	}

	@Override
	public String toString()
	{
		return radical + terminaison;
	}
}
