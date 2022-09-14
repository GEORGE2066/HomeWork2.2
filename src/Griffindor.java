public class Griffindor extends Hogwarts {
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

