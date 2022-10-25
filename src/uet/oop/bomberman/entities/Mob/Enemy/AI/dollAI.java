package uet.oop.bomberman.entities.Mob.Enemy.AI;

import uet.oop.bomberman.GameControl.Player;
import uet.oop.bomberman.entities.Mob.Enemy.Enemy;

import static uet.oop.bomberman.BombermanGame.enemies;
import static uet.oop.bomberman.BombermanGame.player;

public class dollAI extends AI {
        public Player _player;
        public Enemy _e;

        public dollAI() {
            _player = player;
            Enemy _e;
        }

        @Override
        public int calculateDirection() {

            if (_player == null)
                return random.nextInt(4);

            int vertical = random.nextInt(2);

            if (vertical == 1) {
                int v = calculateRowDirection();
                if (v != -1)
                    return v;
                else
                    return calculateColDirection();

            } else {
                int h = calculateColDirection();

                if (h != -1)
                    return h;
                else
                    return calculateRowDirection();
            }

        }

        protected int calculateColDirection() {
            if (_player.getXTile() < _e.getXTile())
                return 3;
            else if (_player.getXTile() > _e.getXTile())
                return 1;

            return -1;
        }

        protected int calculateRowDirection() {
            if (_player.getYTile() < _e.getYTile())
                return 0;
            else if (_player.getYTile() > _e.getYTile())
                return 2;
            return -1;
        }
}