package auxilliaire;

import temps.Temps;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Auxiliaire
{
    public static Auxiliaire getAuxiliaire(String verbe)
    {
        ArrayList<String> verbesEnEtre = new ArrayList<>(Arrays.asList(
                "naitre", "mourir", "décéder", "monter", "descendre", "rentrer", "entrer", "ressortir", "sortir",
                "aller", "revenir", "venir", "redevenir", "devenir", "venir", "arriver", "repartir", "partir",
                "repasser", "passer", "rester", "retourner", "retomber", "tomber"));
        for (String v : verbesEnEtre) {
            if (verbe.equalsIgnoreCase(v)) {
                return new Etre();
            }
        }
        return new Avoir();
    }

    public abstract String getAuxiliaire1erePS(Temps temps, boolean subjonctif);

    public abstract String getAuxiliaire2emePS(Temps temps, boolean subjonctif);

    public abstract String getAuxiliaire3emePS(Temps temps, boolean subjonctif);

    public abstract String getAuxiliaire1erePP(Temps temps, boolean subjonctif);

    public abstract String getAuxiliaire2emePP(Temps temps, boolean subjonctif);

    public abstract String getAuxiliaire3emePP(Temps temps, boolean subjonctif);
}
