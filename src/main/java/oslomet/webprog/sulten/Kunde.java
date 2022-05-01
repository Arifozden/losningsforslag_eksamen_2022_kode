package oslomet.webprog.sulten;

/*
 * Denne POJO-klassen er ikke noe krav i løsningen
 */
public class Kunde {
    private String navn;
    private String mobil;
    private String epost;
    private String passord;

    public Kunde() { }

    public Kunde(String navn, String mobil, String epost, String passord) {
        this.navn = navn;
        this.mobil = mobil;
        this.epost = epost;
        this.passord = passord;
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

    public String getPassord() {
        return passord;
    }

    public void setPassord(String passord) {
        this.passord = passord;
    }
}