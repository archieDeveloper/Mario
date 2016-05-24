package com.mygdx.game.gameObjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.MBHelpers.AssetLoader;

/**
 * Created by Legendary on 21.05.2016.
 */
public class Mario extends Actor {

    TextureRegion region;

    public Mario() {
        region = AssetLoader.mario;
    }

    public void update(float delta) {

    }

    @Override
    public void draw (Batch batch, float parentAlpha) {
        batch.draw(region, getX(), getY());
    }

}
