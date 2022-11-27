public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(1000,50);

        boss.weapon.setWeaponsType(WeaponsType.WEAPONRY);
        boss.weapon.setWeaponsName("SWORD");
        System.out.println("Boss health: " + boss.getHealth() + ", attack: "
                + boss.getAttack() + ",\n Defence Type: "
                + boss.weapon.getWeaponsType() + ",\n Weapons Name: " + boss.weapon.getWeaponsName());



        System.out.println("\n" + "_____dopolnitelno_____________" +
                "\n");
        System.out.println("Boss: " + boss.printInfo() + ", weapons type: " + boss.weapon.getWeaponsType());

        Skeleton skeleton = new Skeleton(250,10);
        skeleton.setNumberOfarrows(3);
        System.out.println("Skeleton 1: " + skeleton.printInfo());

        Skeleton skel = new Skeleton(260,8);
        skeleton.setNumberOfarrows(5) ;
        System.out.println("Skeleton 2: " + skeleton.printInfo());
    }

}