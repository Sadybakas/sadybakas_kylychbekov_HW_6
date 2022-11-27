public class Skeleton extends Boss{
    private int numberOfarrows;
    public Skeleton(int health, int attack) {
        super(health, attack);
    }

    public int getNumberOfarrows() {
        return numberOfarrows;
    }

    public void setNumberOfarrows(int numberOfarrows) {
        this.numberOfarrows = numberOfarrows;
    }
    public String printInfo(){

    return super.printInfo() + ", Number of Arrows: " + getNumberOfarrows();
    }
}
