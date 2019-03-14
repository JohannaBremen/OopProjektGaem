import java.util.Scanner;
public class algus {
    public static void nullpunkt(){
        System.out.println("Tere, see on mängu algus.");
        System.out.println("Kas sa oled varem mänginud? (Trüki 'Y', kui oled ning 'N', kui ei ole ja vajuta klahvi ENTER)");
        Scanner variandid = new Scanner(System.in);
        String vastus = variandid.nextLine();
        if(vastus.equals("Y")){
            kodu.algus();
        }
        else{
            reeglid.alustades();
        }
    }
}
