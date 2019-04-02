public class Mängija {
    private String nimi;
    private int eluAeg;
    private int elud = 100;

    public Mängija(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public int getEluAeg() {
        return eluAeg;
    }

    public int getElud() {
        return elud;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setEluAeg(int eluAeg) {
        this.eluAeg = eluAeg;
    }

    public void setElud(int elud) {
        this.elud = elud;
    }

    public void järgminePäev(int päevi){
        eluAeg += päevi;
        System.out.println("Sa oled suutnud ellu jääda juba " + eluAeg + " päeva. Halb!");
    }
}
