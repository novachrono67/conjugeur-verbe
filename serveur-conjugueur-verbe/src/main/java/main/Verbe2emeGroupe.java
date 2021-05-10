package main;
public class Verbe2emeGroupe extends Verbe {
	
	public Verbe2emeGroupe(String verb){
		super(verb);
	}
	
/*
	public String conjugue1erePersonneSingulier(){
	return super.radical + "is";
	}
	
	public String conjugue1erePersonnePluriel() {
	return super.radical + "issons";
	}
	
	public String conjugueParticipePresent() {
	return super.radical + "issant";
	}
	
	public String conjugueParticipePasse() {
	return super.radical + "i";
	}
*/
	
	
	public String terminaison1erePS() {
		return "is";
	}

	public String terminaison1erePP() {
		return "issons";
	}	

		
	public String terminaisonParticipePasse() {
		return "i";
	}

	

	@Override
	public String terminaison() {
		// TODO Auto-generated method stub
		return "ir";
	}

	@Override
	public String MessageErreur() {
		// TODO Auto-generated method stub
		return "Verbe2emeGroupe";
	}
	
	
}
