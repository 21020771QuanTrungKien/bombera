package uet.oop.bomberman.Level;

import uet.oop.bomberman.BombermanGame;
import uet.oop.bomberman.Game;
import uet.oop.bomberman.entities.Entity;
public class Coordinates {
    public static int pixelToTile(double i) {
        return (int)(i / BombermanGame.map.HEIGHT);
    }

    public static int tileToPixel(int i) {
        return i * BombermanGame.map.HEIGHT;
    }

    public static int tileToPixel(double i) {
        return (int)(i * BombermanGame.map.HEIGHT);
    }
}