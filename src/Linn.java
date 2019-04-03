import java.util.Scanner;

public class Linn {
    static void linnaServ(){
        System.out.println("Sul õnnestub napilt püsti jääda ja sa astud vankrist välja. \n" +
                "Sa uurid oma ümbrust. Sa oled jõudnud väikese linnakese servale. \n" +
                "Vankrile on vastu tulnud kolm valvurit ja keegi tähtis härra tähtsa dokumendiga. \n" +
                "Ta loeb sulle dokumendi ette. Selles on kirjas, et väidetavalt oled sa varastanud ühe keeksi. \n" +
                "Karistus selle eest on 19 aastat sunnitööd. Sa mõtled oma variandid läbi. \n" +
                "Sa võiksid proovida PÕGENEDA või nõuda KOHTUISTUNGIT või oma saatusega LEPPIDA. Mida sa teed?");
        Scanner vastused = new Scanner(System.in);
        String vastus = vastused.nextLine();
        if(vastus.equals("PÕGENEDA")){
            //hjdh
        }
        else if(vastus.equals("KOHTUISTUNGIT")){
            //hafas
        }
        else{
            System.out.println("Sa annad alla ja sind viiakse vanglasse.");
            Vangla.kong();
        }
    }
}
