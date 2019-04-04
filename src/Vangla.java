import java.util.Scanner;

public class Vangla {
    static void kong(){
        System.out.println("Suht kurb olemine siin kongis, ainult üks kongikaaslane.\n" +
                "Tal on suur arm põse peal ja näol kahtlane naeratus\n" +
                " Kas sa tahad temaga rääkida? (Y/N)");
        Scanner variandid = new Scanner(System.in);
        String vastus = variandid.nextLine();
        if(vastus.equals("Y")){
            System.out.println("Vang vastab rõõmsalt, et tema ei pea siin külmas kongis enam kaua passima,\n" +
                    " sest saab homme vabaks");
        }else{
            System.out.println();
        }
    }
}
