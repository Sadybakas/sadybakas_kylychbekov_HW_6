public class GameEntity {
    private int Health;
    private int Attack;

    public GameEntity(int health, int attack) {
        Health = health;
        Attack = attack;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }
}
