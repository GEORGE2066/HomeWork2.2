class Hogwarts {
    private int forseMagic;
    private String name;
    private int distanceTrassiren;
    public Hogwarts(int forseMagic, String name, int distanceTrassiren) {
        this.forseMagic = forseMagic;
        this.distanceTrassiren = distanceTrassiren;
        this.name = name;
    }

    /*GETTER`S*/
    public String getName() {
        return name;
    }
    public int getForseMagic() {
        return forseMagic;
    }
    public int getDistanceTrassiren() {
        return distanceTrassiren;
    }
    /*SETTER`S*/
    public void setName(String name) {
        this.name = name;
    }
    public void setForseMagic(int forseMagic) {
        this.forseMagic = forseMagic;
    }
    public void setDistanceTrassiren(int distanceTrassiren) {
        this.distanceTrassiren = distanceTrassiren;
    }
}



/*ФАКУЛЬТЕТЫ*/

class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    private int sum;
    public Griffindor(int forseMagic, String name, int distanceTrassiren, int nobility, int honor, int bravery) {
        super(forseMagic, name, distanceTrassiren);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        sum = nobility + honor + bravery + forseMagic + distanceTrassiren;
    }
    /*GETTER`S*/
    public int getNobility() {
        return nobility;
    }
    public int getHonor() {
        return honor;
    }
    public int getSum() {
        return sum;
    }
    public int getBravery() {
        return bravery;
    }
    /*SETTER`S*/
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}

class Puffenduy extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;
    private int sum;

    public Puffenduy(int forseMagic, String name, int distanceTrassiren, int hardworking, int loyal, int honest) {
        super(forseMagic, name, distanceTrassiren);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
        sum = hardworking + loyal + honest + distanceTrassiren + forseMagic;
    }

    /*GETTER`S*/
    public int getHardworking() {
        return hardworking;
    }
    public int getLoyal() {
        return loyal;
    }
    public int getSum() {
        return sum;
    }
    public int getHonest() {
        return honest;
    }
    /*SETTE`S*/
    public void setSum(int sum) {
        this.sum = sum;
    }
    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }
    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }
    public void setHonest(int honest) {
        this.honest = honest;
    }
}

class Coktevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int sum;
    private int creative;

    public Coktevran(int forseMagic, String name, int distanceTrassiren, int smart, int wise, int witty, int creative) {
        super(forseMagic, name, distanceTrassiren);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
        sum = smart + wise + witty + forseMagic + distanceTrassiren;
    }



    /*GETTER`S*/
    public int getSum() {
        return sum;
    }
    public int getSmart() {
        return smart;
    }
    public int getWise() {
        return wise;
    }
    public int getWitty() {
        return witty;
    }
    public int getCreative() {
        return creative;
    }
    /*SETTER`S*/
    public void setSmart(int smart) {
        this.smart = smart;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
    public void setWise(int wise) {
        this.wise = wise;
    }
    public void setWitty(int witty) {
        this.witty = witty;
    }
    public void setCreative(int creative) {
        this.creative = creative;
    }
}

class Slitherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int sum;
    private int resourcefulness;

    public Slitherin(int forseMagic, String name, int distanceTrassiren, int cunning, int determination, int ambition, int resourcefulness) {
        super(forseMagic, name, distanceTrassiren);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        sum = cunning + determination + ambition + resourcefulness + forseMagic + distanceTrassiren;
    }

    /*GETTER`S*/
    public int getCunning() {
        return cunning;
    }
    public int getDetermination() {
        return determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public int getSum() {
        return sum;
    }
    /*SETTER`S*/
    public void setCunning(int cunning) {
        this.cunning = cunning;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
    public void setDetermination(int determination) {
        this.determination = determination;
    }
    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }
    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }
}



/*ЧЕК-ПОИНТ*/

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