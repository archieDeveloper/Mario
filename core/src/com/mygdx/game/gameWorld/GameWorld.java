package com.mygdx.game.gameWorld;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.game.gameObjects.Ground;
import com.mygdx.game.gameObjects.Mario;

/**
 * Created by Legendary on 21.05.2016.
 */
public class GameWorld {

    private Stage myStage;

    private Mario mario;

    public GameWorld(Stage stage) {
        myStage = stage;
        mario = new Mario();
        mario.setPosition(50, 70);
        myStage.addActor(mario);
        createGround();
    }

    public void createGround() {
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 10; i++) {
                Ground ground = new Ground();
                ground.setPosition(i*32, j*32);
                myStage.addActor(ground);
            }
        }

        for (int j = 0; j < 2; j++) {
            for (int i = 12; i < 102; i++) {
                Ground ground = new Ground();
                ground.setPosition(i*32, j*32);
                myStage.addActor(ground);
            }
        }

        for (int j = 4; j < 5; j++) {
            for (int i = 5; i < 10; i++) {
                Ground ground = new Ground();
                ground.setPosition(i*32, j*32);
                myStage.addActor(ground);
            }
        }
    }

    public void update(float delta) {
        mario.update(delta);
    }

    public Mario getMario() {
        return mario;
    }
}
