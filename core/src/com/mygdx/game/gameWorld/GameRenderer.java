package com.mygdx.game.gameWorld;

import com.badlogic.gdx.graphics.OrthographicCamera;

/**
 * Created by Legendary on 21.05.2016.
 */
public class GameRenderer {
    private GameWorld myWorld;
    private OrthographicCamera cam;



    public GameRenderer(GameWorld world){
        myWorld = world;
        cam = new OrthographicCamera();
        cam.setToOrtho(true, 240, 170);
        initGameObjects();
        initAssets();
    }

    public void render(){

    }

    private void initGameObjects() {
    }

    private void initAssets() {
    }
}
