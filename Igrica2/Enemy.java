// Danilo Vusurovic 25/026 FIST

package Igrica2;

import java.util.ArrayList;

public class Enemy extends GameObject {
    private String type;
    private int damage;
    private int health;

    // Konstruktor
    public Enemy(int x, int y, int width, int height, String type, int damage, int health) {
        super(x, y, width, height);
        setType(type);
        setDamage(damage);
        setHealth(health);
    }

    // Getteri
    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    // Setteri
    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            System.out.println("Greska: tip neprijatelja ne smije biti prazan.");
        } else {
            this.type = type.trim();
        }
    }

    public void setDamage(int damage) {
        if (damage >= 0 && damage <= 100) {
            this.damage = damage;
        } else {
            System.out.println("Greska: damage mora biti izmedju 0 i 100.");
        }
    }

    public void setHealth(int health) {
        if (health >= 0 && health <= 100) {
            this.health = health;
        } else {
            System.out.println("Greska: health mora biti vei od nule.");
        }
    }

    public int izracunajStetu() {
        return damage;
    }

    public void napadni(Player p) {
        int noviHealth = p.getHealth() - izracunajStetu();
        if (noviHealth < 0) {
            noviHealth = 0;
        }
        p.setHealth(noviHealth);
    }

    public static ArrayList<Enemy> pretraziPoTipu(ArrayList<Enemy> neprijatelji, String upit) {
        ArrayList<Enemy> rezultat = new ArrayList<Enemy>();
        String trazeno = upit.trim().toLowerCase();

        for (Enemy e : neprijatelji) {
            if (toLowerCase().contains(trazeno)) {
                rezultat.add(e);
            }
        }
        return rezultat;
    }

    @Override
    public String toString() {
        return "Enemy[" + type + "] @ (" + getX() + "," + getY() + ") "
                + getWidth() + "x" + getHeight() + " DMG=" + damage + " HP=" + health;
    }
}
