package com.mygdx.game.gameWorld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
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
        stage.addActor(mario);
    }

    public void update(float delta) {
        mario.update(delta);
    }

    public Mario getMario() {
        return mario;
    }
}
