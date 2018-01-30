package fi.academy;

public class Henkilo {
    private String etunimi;
    private String sukunimi;
    private int ika;

    public Henkilo(String etunimi, String sukunimi, int ika) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.ika = ika;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) throws IllegalArgumentException{
        if(ika < 0)
            throw new IllegalArgumentException("Negatiivinen ikä");
        this.ika = ika;
    }

    @Override
    public String toString() {
        return etunimi + " " + sukunimi + ", " + ika + " vuotta";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        Henkilo h = (Henkilo)obj;
        if (etunimi.equals(((Henkilo)obj).etunimi) && sukunimi.equals(h.sukunimi)) {
            return true;
        }
        return false;
    }
}
