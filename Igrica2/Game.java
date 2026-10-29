// Danilo Vusurovic 25/026 FIST

package Igrica2;

import java.util.ArrayList;

public class Game {
    private Player player;
    private ArrayList<Enemy> enemies;
    private ArrayList<String> eventLog;

    public Game(Player player) {
        this.player = player;
        enemies = new ArrayList<Enemy>();
        eventLog = new ArrayList<String>();
    }

    public Player getPlayer() {
        return player;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public ArrayList<String> getEventLog() {
        return eventLog;
    }

    public boolean checkCollision(Player p, Enemy e) {
        return p.intersects(e);
    }

    public void decreaseHealth(Player p, Enemy e) {
        int steta = e.izracunajStetu();
        int stariHP = p.getHealth();
        int noviHP = stariHP - steta;
        if (noviHP < 0) {
            noviHP = 0;
        }
        p.setHealth(noviHP);
        eventLog.add("HIT: " + p.getName() + " by " + e.getType()
                + " for " + steta + " -> HP " + stariHP + " -> " + noviHP);
    }

    public void addEnemy(Enemy e) {
        enemies.add(e);
        eventLog.add("ADD: " + e.toString());
    }

    public ArrayList<Enemy> findByType(String query) {
        ArrayList<Enemy> rezultat = new ArrayList<Enemy>();
        String trazeno = query.trim().toLowerCase();

        for (Enemy e : enemies) {
            if (e.getType().toLowerCase().contains(trazeno)) {
                rezultat.add(e);
            }
        }
        return rezultat;
    }

    public ArrayList<Enemy> collidingWithPlayer() {
        ArrayList<Enemy> rezultat = new ArrayList<Enemy>();
        for (Enemy e : enemies) {
            if (checkCollision(player, e)) {
                rezultat.add(e);
            }
        }
        return rezultat;
    }

}
