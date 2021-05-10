package Terminaison;
import main.Verbe;

public class TerminaisonCER extends Verbe {

	public TerminaisonCER(String verb){
		super(verb);
	}
	
	
	
	@Override
	public String terminaison1erePS() {
		// TODO Auto-generated method stub
		return "ce";
	}

	@Override
	public String terminaison1erePP() {
		// TODO Auto-generated method stub
		return "çons";
	}


	@Override
	public String terminaisonParticipePasse() {
		// TODO Auto-generated method stub
		return "cé";
	}



	@Override
	public String terminaison() {
		// TODO Auto-generated method stub
		return "cer";
	}


	@Override
	public String MessageErreur() {
		// TODO Auto-generated method stub
		return "Verbe en oudre";
	}

}
