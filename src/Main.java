public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss("invisible ", "Kinetic ", 54,
                500, new Weapon("Laser_tech ", WeaponType.LASER_WEAPON));

        Skeleton skeleton1 = new Skeleton("Fire ", "Magic ", 20,
                100, new Weapon("Nuclear ", WeaponType.NUCLEAR_WEAPON), 5);


        Skeleton skeleton2 = new Skeleton("Magic", "Phisical ", 15,
                130, new Weapon("Melee ", WeaponType.MELEE_WEAPON), 5);

        System.out.println("skeleton1 info: " + skeleton1.prntinfo());
        System.out.println("skeleton2 info: " + skeleton2.prntinfo());
    }

}
