public class Boss extends GameEntity{

    Weapon weapon = new Weapon();

    public Boss(int health, int attack) {
        super(health, attack);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){

        return "Health: " + this.getHealth() + ", Attack: " + this.getAttack();
    }
}
