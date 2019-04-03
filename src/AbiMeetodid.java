public class AbiMeetodid {
    //dramaatiliste hetkede ja muu sellise jama jaoks pauside tekitamine
    static void ooteaeg(double sekundeid) {
        try {
            Thread.sleep((int) sekundeid * 1000);
            System.out.println(" ");
        } catch (InterruptedException x) {
        }
    }

    //otsustab, kas sa saad surma või mitte, ellujäämise tõenäosuse määrab parameeter
    static boolean kasSaabSurma(double tõenäosus) {
        double surm = Math.random();
        if (surm < tõenäosus) {
            return false;
        } else {
            return true;
        }
    }
}
