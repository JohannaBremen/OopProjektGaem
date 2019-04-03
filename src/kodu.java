import java.util.Scanner;

public class kodu {
    public static void main(String[] args) {
        peatus();
    }

    public static void algus() {
        System.out.println("Ja siit ta tuleb! ");
        for (int i = 0; i < 10; i++) {
            AbiMeetodid.ooteaeg(1);

        }
        System.out.println("~~~~MEIE SUUR SEIKLUS~~~ (Siia tuleb hiljem parem pealkiri vms)");
        System.out.println(" ");
        System.out.println("Sa ärkad hobuvankris. Väljas on suhteliselt jahe ilm. \n" +
                "Tuul puhub ja taevas on pilves. \n" +
                "Sinu paremal käel on isik, kes näeb välja nagu HOBUSEVARAS. \n" +
                "Sinu vasakul käel on suur villane TEKK, mis tundub väga kare. \n" +
                "Kummaga sa soovid lähemalt tutvuda?");

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
    static Mängija mängija = new Mängija("Peeter Paulus");
    static void hobusevaras() {
        System.out.println("Sa pöördud hobusevarga poole: \"Hei, kas sa oled hobusevaras?\"\n" +
                "Hobusevaras vaatab sulle otsa ja eirab küsimust: \"Mis su nimi on?\"\n" +
                "Sa mõtled endamisi, mis su nimi siis ikkagi on. Ei tule kohe meeldegi. Oled vist peapõrutuse saanud.\n" +
                "Lõpuks siiski koidab! Su nimi on: ");
        Scanner vastused = new Scanner(System.in);
        String nimi = vastused.nextLine();
        mängija.setNimi(nimi);
        System.out.println("Sa ütled hobusevargale oma nime. Ta vaatab sinu poole ja ütleb: \" " + mängija.getNimi() + ", heh nii loll nimi.\"\n" +
                "Sa vihastud räigelt. Kas sa virutad hobusevargale? (Y/N)");
        String vastus = vastused.nextLine();
        if (vastus.equals("Y")) {
            System.out.println("Sa proovid hobusevargale virutada, aga avastad, et su käed on kinni seotud. \n" +
                    "Seega otsustad sa talle peaga virutada. Hobusevargaga ei juhtu midagi, \n" +
                    "aga selle peale virutab ta ise sulle peaga ja sul läheb pilt mustaks.");
            mängija.järgminePäev(1);
            peatus();
        } else if (vastus.equals("N")) {
            System.out.println("Sa otsustad vaikida. Hobusevaras on pettunud, ta tahtis kakelda. Pettumusest keerab ta sulle selja ja jääb magama.");
            öö();
        } else {
            System.out.println("Sa ei oska kirjutada, proovi uuesti. \nKaks tähte ainult. \nEi ole nii raske. \nLoe siis uuesti ja mõtle järele, mida sult tahetakse.");
            AbiMeetodid.ooteaeg(2);
            hobusevaras();
        }
    }

    static void tekk() {
        System.out.println("Kuna väljas on jahe proovid sa endale tekki ümber tõmmata, aga avastad, et su käed on kinni seotud. \n" +
                "Kinniseotud kättega vingerdad sa ennast tekki alla, seda pealt nähes hobusevaras mühatab ja ütleb\n" +
                "\"Mis sa poisike kardad külma või?\"\n" +
                "Mis su nimi üldse on?\" (Enter name pls)");
        Scanner vastused = new Scanner(System.in);
        String nimi = vastused.nextLine();
        mängija.setNimi(nimi);

        System.out.println("Sa ütled hobusevargale oma nime. Ta vaatab sinu poole ja ütleb: \" " + mängija.getNimi() + ", heh ma arvasingi et sinusugusel memmekal on selline nimi.\"\n" +
                "Sa vihastud räigelt. Kas sa virutad hobusevargale? (Y/N)");
        String vastus = vastused.nextLine();
        if(vastus.equals("Y")){
            System.out.println("Sa üritad teki alt välja hüpata, et hobusevargale virutada, \n" +
                    "kuid komistad tekisaba otsa ja lööd pea ära. Sul läheb pilt mustaks.");
            mängija.järgminePäev(1);
            peatus();
        }
        else if (vastus.equals("N")){
            System.out.println("Sa otsustad kommentaarist üle olla ja kuna teki all on mõnusalt soe, jääd sa varsti magama.");
            mängija.järgminePäev(1);
            peatus();
        }
        else {
            System.out.println("Sa ei oska kirjutada, proovi uuesti. \nKaks tähte ainult. \nEi ole nii raske. \nLoe siis uuesti ja mõtle järele, mida sult tahetakse.");
            AbiMeetodid.ooteaeg(2);
            tekk();
        }

    }
    static void peatus(){
        System.out.println("On uus hommik. Sa ärkad selle peale, et vankri juht hüüab valjult sinu nime. \n" +
                "Kui sa lõpuks reageerid, käsib ta sul vankrist VÄLJA ronida. Sa märkad, et su KÄED on ikka veel seotud. \n" +
                "Mida sa edasi teed?");
        Scanner vastused = new Scanner(System.in);
        String vastus = vastused.nextLine();
        if(vastus.equals("VÄLJA")){
            System.out.println("Sa otsustad käsule alluda ja vankrist lahkuda. Su jalg jääb vankriserva taha kinni ja sa hakkad kukkuma.");
            AbiMeetodid.ooteaeg(2);
            if (AbiMeetodid.kasSaabSurma(0.8) == true) {
                Linn.linnaServ();
            }
            else {
                System.out.println("Sa komistad eriti õnnetult ja saad surma.");
                mängija.surm();
            }
        }
        else{
            System.out.println("Sa annad vankrijuhile märku, et tahad oma käsi vabaks saada. Ta raputab ainult pead. \n" +
                    "Sa oled sunnitud seotud kätega vankrist väljuma ja komistad.");
            AbiMeetodid.ooteaeg(2);
            if (AbiMeetodid.kasSaabSurma(0.8) == true) {
                Linn.linnaServ();
            }
            else {
                System.out.println("Sa komistad eriti õnnetult ja saad surma.");
                mängija.surm();
        }
    }
    }
    static void öö(){
        System.out.println("Kuni hobusevaras magab, jälgid sina mööduvat maastikku. Ühe hetkel tundub sulle, et ümbrus on soodne põgenemiseks. \n" +
                "Väljas on läinud hämaraks, hobusevaras magaba ikka veel ja ka vankrijuht tundub unine. \n" +
                "Tõenäoliselt keegi ei märka, kui sa vankrist välja proovid hüpata. Kas sa hüppad? (Y/N)");
        Scanner vastused = new Scanner(System.in);
        String vastus = vastused.nextLine();
        if(vastus.equals("Y")){
            System.out.println("Loll, sa kukkusid surnuks.");
            mängija.surm();
        }else{
            System.out.println("Sa jälgid kerge kahetsusega veel mööduvat maastikku ja süvenevas pimeduses jääd sa vaikselt magama. \n" +
                    "Kuni koidab uus päev.");
            mängija.järgminePäev(1);
            peatus();
        }
    }
}
