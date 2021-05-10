package main;

public abstract class Verbe {
	protected String radical;
	
	public Verbe(String v) {
		if(!v.endsWith(this.terminaison())) throw new IllegalArgumentException(this.MessageErreur()+" : verbe invalide " + v);
		this.radical = v.substring(0, v.length() - this.terminaison().length());
	}
	
	public String conjugue1erePersonneSingulier() {
		return "Je "+this.getRadical()+this.terminaison1erePS();  //ajouter la terminaison e ou is
	}
	
	public String conjugue1erePersonnePluriel() {
		return "Nous "+this.getRadical()+this.terminaison1erePP();
	}
		
	public  String conjugueParticipePresent() {
		return "En "+this.getRadical()+this.terminaison1erePP().substring(0,this.terminaison1erePP().length()-3)+"ant";
	}
	
	public  String conjugueParticipePasse() {
		return this.getRadical()+this.terminaisonParticipePasse();
	}
	
	
	
	public String getRadical() {
		return radical;
	}
	
	public abstract String terminaison();
	public abstract String MessageErreur();
	

	public abstract String terminaison1erePS();
	
	public abstract String terminaison1erePP();
	
	
	public abstract String terminaisonParticipePasse();

	
	@Override
	public String toString() {
		return "Verbe [radical=" + radical + "]";
	}	
	
		
}
