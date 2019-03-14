public class kodu {
    public static void algus(){
        System.out.println("Ja siit ta tuleb! ");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(400);
                System.out.println(" ");
            }
            catch (InterruptedException x) {
            }

        }
        System.out.println("~~~~MEIE SUUR SEIKLUS~~~ (Siia tuleb hiljem parem pealkiri vms)");
        System.out.println(" ");
        System.out.println("Sa ärkad hobuvankris...");
    }
}
