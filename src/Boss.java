public class Boss extends GameEntity {
    private Weapon weapon;

    public Boss(String ability, String deffence, int damage, int health, Weapon weapon) {
        super(ability, deffence, damage, health);
        this.weapon = weapon;
    }
    public Boss(){

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;

    }

    public String printInfo() {
        return " \nDamage: " + getDamage() + " \nHealth: " + getHealth() +
                " \nDeffence: " + getDeffense() + " \nAbility: " + getAbility() + " \nWeapon Type: " +
                weapon.getWeaponType() + " \nWeapon Name: " + weapon.getWeaponName();

    }

}
