package com.mygdx.game.gameObjects;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.MBHelpers.AssetLoader;

/**
 * Created by archie on 24.05.16.
 */
public class Ground extends Actor {

    TextureRegion region;

    public Ground() {
        region = AssetLoader.ground;
    }

    public void update(float delta) {

    }

    @Override
    public void draw (Batch batch, float parentAlpha) {
        batch.draw(region, getX(), getY());
    }
}
