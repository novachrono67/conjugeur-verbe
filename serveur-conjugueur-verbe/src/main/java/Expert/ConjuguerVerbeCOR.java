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

		if (verbeConjugue != null) // succès de ce traducteur
		{
			return verbeConjugue;
		}

		else if (this.suivant != null) // puisque il y a un suivant, on lui confie la tâche de traduction
		{
			return this.suivant.conjugue1(verbe);
		}

		else return "ERREUR - Aucune conjugaison n'a été trouvée pour le verbe \"" + verbe + "\"";
	}

	//  savoir-faire de l'un des traducteurs de la chaîne
	protected abstract String conjugue2(String string);
}
