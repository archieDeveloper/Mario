package com.mygdx.game.gameWorld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Matrix4;
import com.mygdx.game.MBHelpers.AssetLoader;
import com.mygdx.game.gameObjects.Mario;

/**
 * Created by Legendary on 21.05.2016.
 */
public class GameRenderer {

    private GameWorld myWorld;
    private OrthographicCamera cam;
    private final float CAMERA_WIDTH = 240;
    private final float CAMERA_HEIGHT = 170;

    private SpriteBatch batcher;

    private Mario mario;

    private TextureRegion marioDownTime;

    public GameRenderer(GameWorld world) {
        myWorld = world;
        cam = new OrthographicCamera();
        cam.setToOrtho(true, CAMERA_WIDTH, CAMERA_HEIGHT);
        batcher = new SpriteBatch();
        batcher.setProjectionMatrix(cam.combined);
        initGameObjects();
        initAssets();
    }

    public void render() {
        cam.update();
        batcher.setProjectionMatrix(cam.combined);
        Gdx.gl.glClearColor(255, 255, 255, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batcher.begin();
        batcher.draw(
            marioDownTime,
            mario.getX(),
            mario.getY(),
            mario.getWidth() / 2.0f,
            mario.getHeight() / 2.0f,
            mario.getWidth(),
            mario.getHeight(),
            1,
            1,
            0
        );
        batcher.end();
        if (cam.position.x < mario.getX()) {
            cam.position.x = mario.getX();
        }
    }

    private void initGameObjects() {
        mario = myWorld.getMario();
    }

    private void initAssets() {
        marioDownTime = AssetLoader.mario;
    }
}
