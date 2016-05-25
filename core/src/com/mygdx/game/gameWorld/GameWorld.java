package com.mygdx.game.gameWorld;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.game.gameObjects.Ground;
import com.mygdx.game.gameObjects.Mario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Legendary on 21.05.2016.
 */
public class GameWorld {

    private Stage myStage;
    private Camera myCamera;

    private Mario mario;
    private List<Ground> groundCollection;

    public GameWorld(Stage stage) {
        myStage = stage;
        myCamera = stage.getCamera();
        groundCollection = new ArrayList<Ground>();
        createGround();
        mario = new Mario(50, 500, 24, 32, groundCollection);
        myStage.setKeyboardFocus(mario);
        myStage.addActor(mario);
    }

    public void createGround() {
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 10; i++) {
                Ground ground = new Ground(i*32, j*32, 32, 32);
                groundCollection.add(ground);
                myStage.addActor(ground);
            }
        }

        for (int j = 0; j < 2; j++) {
            for (int i = 12; i < 102; i++) {
                Ground ground = new Ground(i*32, j*32, 32, 32);
                groundCollection.add(ground);
                myStage.addActor(ground);
            }
        }

        for (int j = 4; j < 5; j++) {
            for (int i = 5; i < 10; i++) {
                Ground ground = new Ground(i*32, j*32, 32, 32);
                groundCollection.add(ground);
                myStage.addActor(ground);
            }
        }
    }

    public void update(float delta) {
        mario.update(delta);
        if (mario.getX() > myCamera.position.x) {
            myCamera.position.x = mario.getX();
        }
    }

    public Mario getMario() {
        return mario;
    }
}
