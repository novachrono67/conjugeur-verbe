package main;

import Expert.*;
import Terminaison.TerminaisonAITRE;
import Terminaison.TerminaisonCER;
import Terminaison.TerminaisonINDRE;
import Terminaison.TerminaisonOUDRE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	public static void main(String[] args) throws IOException
	{
		//Qui est un cas particulier de qui ? 			Important
		
		Verbe verbe1 = new Verbe1erGroupe("danser");
		Verbe verbe2 = new Verbe2emeGroupe("frémir");
		Verbe verbe3 = new Verbe2emeGroupe("finir");
		Verbe verbe4 = new Verbe1erGroupe("chanter");
		Verbe verbe5 = new Verbe2emeGroupe("nourrir");
		Verbe verbe6 = new Verbe1erGroupe("parler");
		Verbe verbe7 = new Verbe1erGroupe("planter");
		Verbe verbe8 = new Verbe1erGroupe("porter");
		Verbe verbe9 = new Verbe2emeGroupe("rugir");
		Verbe verbe10 = new Verbe2emeGroupe("ralentir");
		Verbe verbe11 = new TerminaisonINDRE("peindre");
		Verbe verbe12 = new TerminaisonAITRE("connaître");
		Verbe verbe13 = new TerminaisonOUDRE("résoudre");
		Verbe verbe14 = new TerminaisonCER("tracer");
		
		Verbe[] liste = {verbe1, verbe2, verbe3, verbe4, verbe5, verbe6, verbe7, verbe8, verbe9, verbe10, verbe11, verbe12, verbe13, verbe14};
		
	/*
		System.out.println(verbe11.conjugue1erePersonneSingulier());
		System.out.println(verbe11.conjugue1erePersonnePluriel());
		System.out.println(verbe11.conjugueParticipePresent());
		System.out.println(verbe11.conjugueParticipePasse());
		
		System.out.println(verbe12.conjugue1erePersonneSingulier());
		System.out.println(verbe12.conjugue1erePersonnePluriel());
		System.out.println(verbe12.conjugueParticipePresent());
		System.out.println(verbe12.conjugueParticipePasse());
		
		System.out.println(verbe13.conjugue1erePersonneSingulier());
		System.out.println(verbe13.conjugue1erePersonnePluriel());
		System.out.println(verbe13.conjugueParticipePresent());
		System.out.println(verbe13.conjugueParticipePasse());
		
		System.out.println(verbe14.conjugue1erePersonneSingulier());
		System.out.println(verbe14.conjugue1erePersonnePluriel());
		System.out.println(verbe14.conjugueParticipePresent());
		System.out.println(verbe14.conjugueParticipePasse());
	*/	
		
		/*
		//L'affichage d'une liste de verbe
		 
		String personneSingulier = ListeVerbes.ConjugueUneListe(liste, new PersonneSingulier());
		System.out.println(personneSingulier);
		
		String personnePluriel = ListeVerbes.ConjugueUneListe(liste, new PersonnePluriel());
		System.out.println(personnePluriel);
		
		String personneParticipePresent = ListeVerbes.ConjugueUneListe(liste, new PersonneParticipePresent());
		System.out.println(personneParticipePresent);
		
		String personneParticipePasse = ListeVerbes.ConjugueUneListe(liste, new PersonneParticipePasse());
		System.out.println(personneParticipePasse);
		*/
		
		
		
		
		ConjuguerVerbe conjuguerVerbe;
		ConjuguerVerbeCOR conjuguerVerbe1erG, conjuguerVerbe2emeG, conjuguerVerbeAITRE, conjuguerVerbeOUDRE, conjuguerVerbeINDRE;
		

		conjuguerVerbe1erG = new ConjuguerVerbe1erGCOR(null);
		
		conjuguerVerbe2emeG = new ConjuguerVerbe2emeGCOR(conjuguerVerbe1erG);
		
		conjuguerVerbeAITRE = new ConjuguerVerbeAITRECOR(conjuguerVerbe2emeG);
		
		conjuguerVerbeOUDRE = new ConjuguerVerbeOUDRECOR(conjuguerVerbeAITRE);
		
		conjuguerVerbeINDRE = new ConjuguerVerbeINDRECOR(conjuguerVerbeOUDRE);
		
		
		conjuguerVerbe = conjuguerVerbeINDRE;
		

	
		System.out.println("Tapez un verbe à l'infinitif");
		String donnée, résultat;

		BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
		donnée  = clavier.readLine().trim();

		résultat = conjuguerVerbe.conjugue(donnée);

		System.out.println("La traduction de "+ donnée+" est : "+"\n" +résultat);

		
		
		
		
		
		
		
		
		
		
	}
}


