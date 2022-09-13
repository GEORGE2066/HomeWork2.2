public class Hogwarts {
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
