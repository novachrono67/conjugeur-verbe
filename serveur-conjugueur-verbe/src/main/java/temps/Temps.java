package temps;

import verbe.Verbe;

public abstract class Temps
{
    private String temps;

    public Temps(String temps)
    {
        this.temps = temps;
    }

    public String conjugue(Verbe verbe)
    {
        return conjugue1erePersonneSingulier(verbe) + "\n" +
                conjugue2emePersonneSingulier(verbe) + "\n" +
                conjugue3emePersonneSingulier(verbe) + "\n" +
                conjugue1erePersonnePluriel(verbe) + "\n" +
                conjugue2emePersonnePluriel(verbe) + "\n" +
                conjugue3emePersonnePluriel(verbe);
    }

    public abstract String conjugue1erePersonneSingulier(Verbe verbe);

    public abstract String conjugue2emePersonneSingulier(Verbe verbe);

    public abstract String conjugue3emePersonneSingulier(Verbe verbe);

    public abstract String conjugue1erePersonnePluriel(Verbe verbe);

    public abstract String conjugue2emePersonnePluriel(Verbe verbe);

    public abstract String conjugue3emePersonnePluriel(Verbe verbe);
}
