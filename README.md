# Game 2 OOP
# Danilo Vusurovic 25/026 FIST
# Objektno Orijentisano Programiranje

Jednostavna Java igra sa igracem i neprijateljima – hijerarhija klasa.

- `GameObject` – pozicija (x, y), dimenzije (width, height), kolizija `intersects()`
- `Player` – nasljedjuje GameObject, ime (automatski formatirano), health (0–100)
- `Enemy` – nasljedjuje GameObject, tip, damage (0–100), health (0–100)
- `MeleeEnemy` – osnovna steta
- `BossEnemy` – dupla steta
- `Game` – detekcija sudara, smanjenje health-a, pretraga po tipu, event log

## Pokretanje

```bash
javac Igrica2/*.java
java Igrica2.Main
```
