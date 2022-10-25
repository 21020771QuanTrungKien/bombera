package uet.oop.bomberman.entities.Mob.Enemy;

import javafx.scene.image.Image;
import uet.oop.bomberman.entities.Mob.Enemy.AI.dollAI;
import uet.oop.bomberman.graphics.Sprite;

public class Doll extends Enemy {


        public Doll(int x, int y, Image img) {
            super(x, y, img);

            sprite = Sprite.doll_right1;

            ai = new dollAI();
            direction = ai.calculateDirection();
        }

        /*
        |--------------------------------------------------------------------------
        | Mob Sprite
        |--------------------------------------------------------------------------
         */
        @Override
        public void chooseSprite() {
            switch(direction) {
                case 0:
                case 1:
                    if(moving)
                        sprite = Sprite.movingSprite(Sprite.doll_right1, Sprite.doll_right2, Sprite.doll_right3, animate, 60);
                    else
                        sprite = Sprite.doll_left1;
                    break;
                case 2:
                case 3:
                    if(moving)
                        sprite = Sprite.movingSprite(Sprite.doll_left1, Sprite.doll_left2, Sprite.doll_left3, animate, 60);
                    else
                        sprite = Sprite.doll_left1;
                    break;
            }
        }
}

