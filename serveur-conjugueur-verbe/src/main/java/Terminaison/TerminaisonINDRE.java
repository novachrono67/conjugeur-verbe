package Terminaison;
import main.Verbe;

public class TerminaisonINDRE extends Verbe {

	public TerminaisonINDRE(String verb){
		super(verb);
	}
	
	

	@Override
	public String terminaison1erePS() {
		// TODO Auto-generated method stub
		return "ins";
	}

	@Override
	public String terminaison1erePP() {
		// TODO Auto-generated method stub
		return "ignons";
	}


	@Override
	public String terminaisonParticipePasse() {
		// TODO Auto-generated method stub
		return "int";
	}



	@Override
	public String terminaison() {
		// TODO Auto-generated method stub
		return "indre";
	}


	@Override
	public String MessageErreur() {
		// TODO Auto-generated method stub
		return "Verbe en indre";
	}

}
