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
