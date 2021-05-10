package Terminaison;
import main.Verbe;

public class TerminaisonAITRE extends Verbe {

	public TerminaisonAITRE(String verb){
		super(verb);
	}
	


	@Override
	public String terminaison1erePS() {
		// TODO Auto-generated method stub
		return "ais";
	}

	@Override
	public String terminaison1erePP() {
		// TODO Auto-generated method stub
		return "aissons";
	}


	@Override
	public String terminaisonParticipePasse() {
		// TODO Auto-generated method stub
		return "u";
	}



	@Override
	public String terminaison() {
		// TODO Auto-generated method stub
		return "aître";
	}



	@Override
	public String MessageErreur() {
		// TODO Auto-generated method stub
		return "Verbe en aître";
	}

}