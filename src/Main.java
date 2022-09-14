public class Main {
    public static void main (String[] args) {
        Griffindor RU = new Griffindor(43, "Ron", 54, 67, 43, 23);
        Griffindor GG = new Griffindor(43, "Ron", 54, 67, 43, 23);
        Griffindor GP = new Griffindor(43, "Ron", 54, 67, 43, 23);

        Puffenduy ZS = new Puffenduy(43, "Ron", 54, 67, 43, 23);
        Puffenduy SD = new Puffenduy(43, "Ron", 54, 67, 43, 23);
        Puffenduy JFF = new Puffenduy(43, "Ron", 54, 67, 43, 23);

        Coktevran CC = new Coktevran(43, "Ron", 54, 67, 43, 23,74);
        Coktevran PP = new Coktevran(43, "Ron", 54, 67, 43, 23,65);
        Coktevran MB = new Coktevran(43, "Ron", 54, 67, 43, 23,45);

        Slitherin DM = new Slitherin(43, "Ron", 54, 67, 43, 23,32);
        Slitherin GM = new Slitherin(43, "Ron", 54, 67, 43, 23,12);
        Slitherin GGo = new Slitherin(43, "Ron", 54, 67, 43, 23,65);

        String puff = WhoIsBigger.WhoIsBiggerPuff(ZS, SD);
        String cokt = WhoIsBigger.WhoIsBiggerCokte(MB, PP);
        String slit = WhoIsBigger.WhoIsBiggerSlith(GGo, DM);
        String griff = WhoIsBigger.WhoIsBiggerGriff(GG, GP);

        System.out.println(puff);
        System.out.println(cokt);
        System.out.println(slit);
        System.out.println(griff);
    }
}