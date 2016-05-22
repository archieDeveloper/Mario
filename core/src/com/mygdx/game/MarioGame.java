package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.MBHelpers.AssetLoader;
import com.mygdx.game.screens.GameScreen;

public class MarioGame extends Game {

    @Override
    public void create() {
        AssetLoader.load();
        setScreen(new GameScreen());
    }

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
}
