package temps;

import verbe.Verbe;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Temps
{
    private String temps;
    private boolean tempsCompose;

    public Temps(String temps, boolean tempsCompose)
    {
        this.temps = temps;
        this.tempsCompose = tempsCompose;
    }

    public String conjugue(Verbe verbe, boolean subjonctif)
    {
        return conjugue1erePersonneSingulier(verbe, subjonctif) + "\n" +
                conjugue2emePersonneSingulier(verbe, subjonctif) + "\n" +
                conjugue3emePersonneSingulier(verbe, subjonctif) + "\n" +
                conjugue1erePersonnePluriel(verbe, subjonctif) + "\n" +
                conjugue2emePersonnePluriel(verbe, subjonctif) + "\n" +
                conjugue3emePersonnePluriel(verbe, subjonctif);
    }

    protected String getPronom1erPS(Verbe verbe, boolean subjonctif)
    {
        String pronom = getSubjonctifIfNeeded(subjonctif);
        if ((tempsCompose && premiereLettreVoyelle(verbe.getAuxiliaire().getAuxiliaire1erePS(this, subjonctif))) ||
                premiereLettreVoyelle(verbe.toString()))
        {
            pronom += "J'";
        } else {
            pronom += "Je ";
        }
        return pronom;
    }

    protected String getPronom2emePS(boolean subjonctif)
    {
        return getSubjonctifIfNeeded(subjonctif) + "Tu ";
    }

    protected String getPronom3emePS(boolean subjonctif)
    {
        return getSubjonctifIfNeeded(subjonctif) + "Il/Elle ";
    }

    protected String getPronom1erePP(boolean subjonctif)
    {
        return getSubjonctifIfNeeded(subjonctif) + "Nous ";
    }

    protected String getPronom2emePP(boolean subjonctif)
    {
        return getSubjonctifIfNeeded(subjonctif) + "Vous ";
    }

    protected String getPronom3emePP(boolean subjonctif)
    {
        return getSubjonctifIfNeeded(subjonctif) + "Ils/Elles ";
    }

    protected abstract String conjugue1erePersonneSingulier(Verbe verbe, boolean subjonctif);

    protected abstract String conjugue2emePersonneSingulier(Verbe verbe, boolean subjonctif);

    protected abstract String conjugue3emePersonneSingulier(Verbe verbe, boolean subjonctif);

    protected abstract String conjugue1erePersonnePluriel(Verbe verbe, boolean subjonctif);

    protected abstract String conjugue2emePersonnePluriel(Verbe verbe, boolean subjonctif);

    protected abstract String conjugue3emePersonnePluriel(Verbe verbe, boolean subjonctif);

    private boolean premiereLettreVoyelle(String verbe)
    {
        ArrayList<String> listeVoyelles = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u", "y"));
        String premiereLettre = verbe.substring(0, 1);
        for (String str : listeVoyelles) {
            if (premiereLettre.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private String getSubjonctifIfNeeded(boolean subjonctif)
    {
        if (subjonctif) {
            return "Que ";
        }
        return "";
    }

    public String getTemps()
    {
        return temps;
    }
}
