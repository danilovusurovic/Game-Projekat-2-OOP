// Danilo Vusurovic 25/026 FIST

package Igrica2;

public class MeleeEnemy extends Enemy {

    public MeleeEnemy(int x, int y, int width, int height, String type, int damage, int health) {
        super(x, y, width, height, type, damage, health);
    }

    @Override
    public int izracunajStetu() {
        return getDamage();
    }
}
