package Terminaison;
import main.Verbe;

public class TerminaisonOUDRE extends Verbe {

	public TerminaisonOUDRE(String verb){
		super(verb);
	}
	
	
	
	@Override
	public String terminaison1erePS() {
		// TODO Auto-generated method stub
		return "ous";
	}

	@Override
	public String terminaison1erePP() {
		// TODO Auto-generated method stub
		return "olvons";
	}


	@Override
	public String terminaisonParticipePasse() {
		// TODO Auto-generated method stub
		return "olu";
	}



	@Override
	public String terminaison() {
		// TODO Auto-generated method stub
		return "oudre";
	}


	@Override
	public String MessageErreur() {
		// TODO Auto-generated method stub
		return "Verbe en oudre";
	}

}