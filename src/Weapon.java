public class Weapon {
    private WeaponType weaponType;
    private String weaponName;

    public Weapon(String weaponName, WeaponType weaponType) {
        this.weaponName = weaponName;
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}

