import java.util.Scanner;

public class Mängija {
    private String nimi;
    private int eluAeg = 1;
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

    public void järgminePäev(int päevi) {
        eluAeg += päevi;
        AbiMeetodid.ooteaeg(2);
        System.out.println("~~~");
        System.out.println();
        System.out.println("Sa oled elus juba " + eluAeg + ". päeva. Läheb hästi!");
        System.out.println();
        System.out.println("~~~");
        AbiMeetodid.ooteaeg(2);
    }

    public void surm() {
        AbiMeetodid.ooteaeg(4);
        System.out.println("Sa surid. \n\n");
        AbiMeetodid.ooteaeg(1);
        System.out.println("RIP in peperony");
        AbiMeetodid.ooteaeg(1);
        System.out.println(getNimi());
        AbiMeetodid.ooteaeg(1);
        System.out.println("Elatud päevi: " + eluAeg);
        AbiMeetodid.ooteaeg(1);
        System.out.println("Sa surid. Nii kahju. 😢");
        System.out.println("Kas tahad veel mängida? (Y/N)");
        Scanner variandid = new Scanner(System.in);
        String vastus = variandid.nextLine();
        if (vastus.equals("Y")) {
            kodu.algus();
        }else {
            System.out.println("Oli tore! Bye!❤😘💕👌😂💦🍆✔✔");
        }
    }
}
