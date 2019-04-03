import java.util.Scanner;

public class reeglid {
    public static void alustades(){
        System.out.println("Tegemist on choose-your-own-adventure-tüüpi mänguga, mille käik sõltub täielikult Sinu valikutest. \n" +
                "Mängus edasi liikumiseks on vaja jälgida loo arengut ja selle põhjal valida, mida edasi teha. \n" +
                "Jah/ei tüüpi valikuid märgib teksti lõpus olev (Y/N). Sellisel juhul tuleb trükkida vastav täht ja vajutada ENTER. \n" +
                "Mõnikord juhtub, et valik ei ole nii lihtne ja valida tuleb kahe või rohkema erineva tegevuse vahel. \n" +
                "Sellisel juhul on mängu tekstis vastavate valikute jaoks läbiva suurtähega märksõnad. \n" +
                "Mingi märksõna trükkimine tähendab sellele vastava loo jätkamise variandi valimist. \n" +
                "Kuna see mäng ei ole veel väga tark, siis kirjuta palun märksõna täpselt samamoodi nagu see tekstis on! \n");
        System.out.println("Kas Kõik on selge? (Y/N)");
        Scanner variandid = new Scanner(System.in);
        String vastus = variandid.nextLine();
        if(vastus.equals("N")){
            System.out.println("Loeme siis koos uuesti :)");
            alustades();

        }
        else {
            System.out.println("Nii tore!");
            System.out.println("Alustame kohe seiklusega!");
            DramaatilinePaus.ooteaeg(3);

            kodu.algus();
        }
    }
}
