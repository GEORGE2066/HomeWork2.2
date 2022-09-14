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
