package oslomet.webprog.sulten;

/*
 * Denne POJO-klassen er ikke noe krav i løsningen
 */
public class Bestilling {
    private String navn;
    private String mobil;
    private String epost;
    private int bord;
    private String varer;

    public Bestilling() { }

    public Bestilling(String navn, String mobil, String epost, int bord, String varer) {
        this.navn = navn;
        this.mobil = mobil;
        this.epost = epost;
        this.bord = bord;
        this.varer = varer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public int getBord() {
        return bord;
    }

    public void setBord(int bord) {
        this.bord = bord;
    }

    public String getVarer() {
        return varer;
    }

    public void setVarer(String varer) {
        this.varer = varer;
    }
}
