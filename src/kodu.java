import java.util.Scanner;

public class kodu {

    public static void algus() {
        System.out.println("Ja siit ta tuleb! ");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(400);
                System.out.println(" ");
            } catch (InterruptedException x) {
            }

        }
        System.out.println("~~~~MEIE SUUR SEIKLUS~~~ (Siia tuleb hiljem parem pealkiri vms)");
        System.out.println(" ");
        System.out.println("Sa ärkad hobuvankris. Väljas on suhteliselt jahe ilm. \n Tuul puhub ja taevas on pilves. \nSinu paremal käel on isik, kes näeb välja nagu HOBUSEVARAS. \n" +
                "Sinu vasakul käel on suur villane TEKK, mis tundub väga kare. \nKummaga sa soovid lähemalt tutvuda?");

        Scanner variandid = new Scanner(System.in);
        String vastus = variandid.nextLine();
        if (vastus.equals("HOBUSEVARAS")) {
            hobusevaras();
        } else if (vastus.equals("TEKK")) {
            tekk();
        } else {
            System.out.println("Sa oled loll, ma valin siis ise. " +
                    "Seekord! " +
                    "Edaspidi nii lihtsalt ei saa!");
            double valik = Math.random();
            if (valik < 0.5) {
                hobusevaras();
            } else {
                tekk();
            }

        }
    }

    static void hobusevaras() {
        System.out.println("Sa pöördud hobusevarga poole: \"Hei, kas sa oled hobusevaras?\"\n" +
                "Hobusevaras vaatab sulle otsa ja ignob küsimust: \"A mis su nimi on?\"\n" +
                "Sa mõtled endamisi, mis su nimi siis ikkagi on. Ei tule kohe meeldegi. Oled vist peapõrutuse saanud.\n" +
                "Lõpuks siiski koidab! Su nimi on: ");
        Scanner vastused = new Scanner(System.in);
        String nimi = vastused.nextLine();
        Mängija mängija = new Mängija(nimi);
        System.out.println("Sa ütled hobusevargale oma nime. Ta vaatab sinu poole ja ütleb: \" " + mängija.getNimi() + ", heh nii loll nimi.\"\n" +
                "Sa vihastud räigelt. Kas sa virutad hobusevargale? (Y/N)");
        String vastus = vastused.nextLine();
        if (vastus.equals("Y")) {
            System.out.println("Sa proovid hobusevargale virutada, aga avastad, et su käed on kinni seotud. \n" +
                    "Seega otsustad sa talle peaga virutada. Selle peale virutab hobusevaras sulle peaga ja sul läheb pilt mustaks.");
            mängija.järgminePäev(1);
        } else if (vastus.equals("N")) {
            System.out.println("Sa otsustad vaikida. Hobusevaras on pettunud, ta tahtis kakelda. Pettumusest keerab ta sulle selja ja jääb magama.");
        } else {
            System.out.println("Sa ei oska kirjutada, proovi uuesti. \nKaks tähte ainult. \nEi ole nii raske. \nLoe siis uuesti ja mõtle järele, mida sult tahetakse.");
            try {
                Thread.sleep(2000);
                System.out.println();
                System.out.println();
            } catch (InterruptedException x) {
            }
            hobusevaras();
        }
    }

    static void tekk() {
        System.out.println("Kuna väljas on jahe proovid sa endale tekki ümber tõmmata, aga avastad, et su käed on kinni seotud. \n" +
                "Kinniseotud kättega vingerdad sa ennast tekki alla, seda pealt nähes hobusevaras mühatab ja ütleb\n" +
                "\"Mis sa poisike kardad külma või?\"\n" +
                "Mis su nimi üldse on?\"");
        Scanner vastused = new Scanner(System.in);
        String nimi = vastused.nextLine();
        Mängija mängija = new Mängija(nimi);
        System.out.println("Sa ütled hobusevargale oma nime. Ta vaatab sinu poole ja ütleb: \" " + mängija.getNimi() + ", heh ma arvasingi et sinusugusel memmekal on selline nimi.\"\n" +
                "Sa vihastud räigelt. Kas sa virutad hobusevargale? (Y/N)");
        String vastus = vastused.nextLine();
        if(vastus.equals("Y")){
            System.out.println("Sa üritad teki alt välja hüpata, et hobusevargale virutada, \n" +
                    "kuid komistad tekisaba otsa ja lööd pea ära. Sul läheb pilt mustaks.");
            mängija.järgminePäev(1);
        }
        else if (vastus.equals("N")){
            System.out.println("Sa otsustad kommentaarist üle olla ja kuna teki all on mõnusalt soe jääd sa varsti magama.");
            mängija.järgminePäev(1);
        }
        else {
            System.out.println("Sa ei oska kirjutada, proovi uuesti. \nKaks tähte ainult. \nEi ole nii raske. \nLoe siis uuesti ja mõtle järele, mida sult tahetakse.");
            try {
                Thread.sleep(2000);
                System.out.println();
                System.out.println();
            } catch (InterruptedException x) {
            }
            tekk();
        }

    }
    static void peatus(){

        System.out.println("On uus hommik. Sa ärkad selle peale, et vankri juht hüüab valjult sinu nime. \n" +
                "Kui sa lõpuks reageerid, käsib ta sul vankrist VÄLJA ronida. Sa märkad, et su KÄED on ikka veel seotud. \n" +
                "");
    }
}
