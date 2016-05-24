package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MBHelpers.AssetLoader;
import com.mygdx.game.screens.GameScreen;

public class MarioGame extends Game {

    private SpriteBatch batch;
    private GameScreen gameScreen;

    @Override
    public void create() {
        AssetLoader.load();
        batch = new SpriteBatch();
        gameScreen = new GameScreen(batch);
        setScreen(gameScreen);
    }

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }

    public void showGame() {
        setScreen(gameScreen);
    }
}
