// Danilo Vusurovic 25/026 FIST

package Igrica2;

public class Player extends GameObject {
    private String name;
    private int health;

    public Player(int x, int y, int width, int height, String name, int health) {
        super(x, y, width, height);
        setName(name);
        setHealth(health);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Greska: ime igraca ne smije biti prazno.");
        } else {
            this.name = formatirajIme(name);
        }
    }

    public void setHealth(int health) {
        if (health >= 0 && health <= 100) {
            this.health = health;
        } else {
            System.out.println("Greska: health mora biti izmedju 0 i 100.");
        }
    }

    // " peTar petrpovic
    public static String formatirajIme(String ime) {
        String[] rijeci = ime.trim().split("\\s+");
        StringBuilder rezultat = new StringBuilder();

        for (int i = 0; i < rijeci.length; i++) {
            String rijec = rijeci[i];
            rezultat.append(rijec.substring(0, 1).toUpperCase());
            rezultat.append(rijec.substring(1).toLowerCase());
            if (i < rijeci.length - 1) {
                rezultat.append(" ");
            }
        }
        return rezultat.toString();
    }

    @Override
    public String toString() {
        return "Player[" + name + "] @ (" + getX() + "," + getY() + ") "
                + getWidth() + "x" + getHeight() + " HP=" + health;
    }
}
