public class DramaatilinePaus {
    static void ooteaeg(double sekundeid) {
        try {
            Thread.sleep((int) sekundeid * 1000);
            System.out.println(" ");
        } catch (InterruptedException x) {
        }
    }
}
