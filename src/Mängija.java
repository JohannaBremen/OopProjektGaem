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
        System.out.println("Sa oled suutnud ellu jääda juba " + eluAeg + " päeva. Halb!");
    }

    public void surm() {
        try {
            Thread.sleep(4000);
            System.out.println(" ");
        } catch (InterruptedException x) {
        }
        System.out.println("Sa surid. \n\n");
        try {
            Thread.sleep(1000);
            System.out.println(" ");
        } catch (InterruptedException x) {
        }
        System.out.println("RIP in peperony");
        try {
            Thread.sleep(1000);
            System.out.println(" ");
        } catch (InterruptedException x) {
        }
        System.out.println(getNimi());
        try {
            Thread.sleep(1000);
            System.out.println(" ");
        } catch (InterruptedException x) {
        }
        System.out.println("Elatud päevi: " + eluAeg);
        try {
            Thread.sleep(1000);
            System.out.println(" ");
        } catch (InterruptedException x) {
        }
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
