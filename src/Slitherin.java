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
