package com.mygdx.game.screens;

import com.badlogic.gdx.Screen;
import com.mygdx.game.gameWorld.GameRenderer;
import com.mygdx.game.gameWorld.GameWorld;

/**
 * Created by Legendary on 21.05.2016.
 */
public class GameScreen implements Screen {



    private GameWorld world;
    private GameRenderer renderer;

    public GameScreen(){
        world = new GameWorld();
        renderer = new GameRenderer(world);
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        world.update(delta);
        renderer.render();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
