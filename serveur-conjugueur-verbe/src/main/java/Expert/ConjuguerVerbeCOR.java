package Expert;

public abstract class ConjuguerVerbeCOR implements ConjuguerVerbe
{
	protected ConjuguerVerbeCOR suivant;

	public ConjuguerVerbeCOR(ConjuguerVerbeCOR expertSuivant)
	{
		this.suivant = expertSuivant ;
	}

	public String conjugue(String verbe)
	{
		String verbeConjugue = this.conjugue1(verbe);

		if(verbeConjugue != null)
		{
			return verbeConjugue;
		}

		else if(this.suivant != null)
		{
			return this.suivant.conjugue(verbe);
		}

		else return null;
	}
	
	private String conjugue1(String verbe)
	{
		String verbeConjugue;
		verbeConjugue = conjugue2(verbe); // ce traducteur tente de prendre en charge la traduction

		if (verbeConjugue != null) // succ�s de ce traducteur
		{
			return verbeConjugue;
		}

		else if (this.suivant != null) // puisque il y a un suivant, on lui confie la t�che de traduction
		{
			return this.suivant.conjugue1(verbe);
		}

		else return "ERREUR - Aucune conjugaison n'a �t� trouv�e pour le verbe \"" + verbe + "\"";
	}

	//  savoir-faire de l'un des traducteurs de la cha�ne
	protected abstract String conjugue2(String string);
}
