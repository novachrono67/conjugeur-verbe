package main;
public class Verbe1erGroupe extends Verbe {
	
	public Verbe1erGroupe(String verb){
		super(verb);
	}
/*
	// les 2 à supprimer
	
	@Override
	public String conjugueParticipePresent() {
	return super.radical + "ant";
	}
	
	@Override
	public String conjugueParticipePasse() {
	return super.radical + "é";
	}
*/
	
	public String terminaison1erePS() {
		return "e";
	}
	
	public String terminaison1erePP() {
		return "ons";
	}
	
	public String terminaisonParticipePasse() {
		return "é";
	}



	@Override
	public String terminaison() {
		// TODO Auto-generated method stub
		return "er";
	}


	@Override
	public String MessageErreur() {
		// TODO Auto-generated method stub
		return "Verbe1erGroupe";
	}


}


