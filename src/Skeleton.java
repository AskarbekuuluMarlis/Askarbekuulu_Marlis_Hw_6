public class Skeleton extends Boss{
    private int numberOfArrows;

    public Skeleton(String ability, String deffence, int damage, int health, Weapon weapon, int numberOfArrows) {
        super(ability, deffence, damage, health, weapon);
        this.numberOfArrows = numberOfArrows;
    }


    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }
    public String prntinfo() {
        return super.printInfo() + " \nnumberOfArrows: " + numberOfArrows;
    }
}
