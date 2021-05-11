package expert;

import verbe.Verbe;

public abstract class ConjuguerVerbeCOR implements ConjuguerVerbe
{
	protected ConjuguerVerbeCOR suivant;

	public ConjuguerVerbeCOR(ConjuguerVerbeCOR expertSuivant)
	{
		this.suivant = expertSuivant ;
	}

	public Verbe conjugue(String verbe)
	{
		Verbe verbeConjugue = this.conjugue1(verbe);

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
	
	private Verbe conjugue1(String verbe)
	{
		Verbe verbeConjugue;
		verbeConjugue = conjugue2(verbe); // ce traducteur tente de prendre en charge la traduction

		if (verbeConjugue != null) // succès de ce traducteur
		{
			return verbeConjugue;
		}

		else if (this.suivant != null) // puisque il y a un suivant, on lui confie la tâche de traduction
		{
			return this.suivant.conjugue1(verbe);
		}

		else return null;
	}

	//  savoir-faire de l'un des traducteurs de la chaîne
	protected abstract Verbe conjugue2(String string);
}
