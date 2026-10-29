// Danilo Vusurovic 25/026 FIST

package Igrica2;

public class BossEnemy extends Enemy {

    public BossEnemy(int x, int y, int width, int height, String type, int damage, int health) {
        super(x, y, width, height, type, damage, health);
    }

    // Boss nanosi duplu stetu
    @Override
    public int izracunajStetu() {
        return getDamage() * 2;
    }
}
