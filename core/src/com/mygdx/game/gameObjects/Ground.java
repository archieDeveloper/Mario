package com.mygdx.game.gameObjects;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.MBHelpers.AssetLoader;

/**
 * Created by archie on 24.05.16.
 */
public class Ground extends Actor {

    TextureRegion region;

    Rectangle bounds;
    ShapeRenderer renderer;


    public Ground(int x, int y, int width, int height) {
        region = AssetLoader.ground;
        setPosition(x, y);
        setWidth(width);
        setHeight(height);
        bounds = new Rectangle(x, y, width, height);
        renderer = new ShapeRenderer();
    }

    public void update(float delta) {

    }

    @Override
    public void draw (Batch batch, float parentAlpha) {
        batch.draw(region, getX(), getY());
        renderer.setProjectionMatrix(batch.getProjectionMatrix());
        batch.end();
        renderer.begin(ShapeRenderer.ShapeType.Line);
        renderer.setColor(Color.BLUE);
        renderer.rect(bounds.x, bounds.y, bounds.width, bounds.height);
        renderer.end();
        batch.begin();
    }
}
