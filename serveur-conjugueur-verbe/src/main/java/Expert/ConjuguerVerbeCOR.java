package Expert;

public abstract class ConjuguerVerbeCOR implements ConjuguerVerbe
{
	protected ConjuguerVerbeCOR suivant;

	public ConjuguerVerbeCOR(ConjuguerVerbeCOR expertSuivant)
	{
		this.suivant = expertSuivant ;
	}

	public String conjugue(String verbeatraduire)
	{
		String verbetraduit = this.conjugue1(verbeatraduire);

		if(verbetraduit != null)
		{
			return verbetraduit;
		}

		else if(this.suivant != null)
		{
			return this.suivant.conjugue(verbeatraduire);
		}

		else return null;
	}
	
	private String conjugue1(String verbeatraduire)
	{
		String verbetraduit;
		verbetraduit = conjugue2(verbeatraduire); // ce traducteur tente de prendre en charge la traduction

		if (verbetraduit != null) // succès de ce traducteur
		{
			return verbetraduit;
		}

		else if (this.suivant != null) // puisque il y a un suivant, on lui confie la tâche de traduction
		{
			return this.suivant.conjugue1(verbeatraduire);
		}

		else return null;
	}

	//  savoir-faire de l'un des traducteurs de la chaîne
	protected abstract String conjugue2(String string);
}
