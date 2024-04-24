public class GameEntity {
    private int damage;
    private int health;
    private String deffense;
    private String ability;

    public GameEntity(String ability, String deffence, int damage, int health) {
        this.ability = ability;
        this.deffense = deffence;
        this.damage = damage;
        this.health = health;
    }
    public GameEntity() {

    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getDeffense() {
        return deffense;
    }

    public void setDeffense(String deffense) {
        this.deffense = deffense;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;


    }
}
